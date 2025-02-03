/* 
 * 1) Segemet tree is type of full binary tree also called proper tree(each node has two children except leaf nodes) used to store range of queries, for example to calulate subarray sum between two given index
 * 2) Two major operation take place in segment tree i.e :- Query and Update although both carried out in O(log n)
 * 3) Segement tree problem involve two steps i.e. 
 *  - step 1:- creation of nodes
 *  - step 2:- construction of segement tree
 * 4) Nodes are used to store special information of values in given range
 * 5) step 1 i.e creation of nodes further divided in two step 
 *  - count of nodes:- total levels:- log2n, total nodes= 2n-1= for safety purpose 4n
 *  - meaning of nodes:- store information for exampke subarray sum of different ranges
 * 6) Points to remember while encountering question related to segement tree
 *  - if size of given data structure i.e array be n then size of segement tree will be 4n
 *  - if i is the node then 2i+1 is left child node and 2i+1 is right child node
 * 7) Different cases which arise while querying the segment t
ee
 *  - case 1:- non overlapping:- (qj<=si) or (qi>=sj):- on right subtree
 *  - case 2:- complete overlap:- (si>=qi) && (sj<=qj) include tree[i]:- on left subtree
 *  - case 3:- partial overlap:- calulate mid i.e mid =(si+sj)/2, left= (si, mid) + right(mid+1, j)
 * 8) pseudo code
 * - getSum(i, si, sj, qi, qi){
 * - if(qj<=si || qj>=sj){
 * - return 0
 * - }else if(si>=qi && sj<=qj){
 * - return tree[i];
 * - }else {
 * -  mid= (si+sj)/2;
 * -  return getSum(2*i+1, si, mid, qi, qj)+ getSum(2*i+2, mid+1, sj, qi, qj)
 * - }
 * - }
 *  8) case 1 and 2 are base cases and case 3 is normal condition
 *  9) For Update at an index
 */
class basic {
  // construction of Segment tree- O(n)
  //Query and Update:- O(log n)
  static int tree[];

  public static void init(int n) {
    tree = new int[4 * n];
  }

  public static int buildST(int arr[], int index, int start, int end) {
    if (start == end) {
      tree[index] = arr[start];
      return arr[start];
    }
    int mid = (start + end) / 2;
    buildST(arr, 2 * index + 1, start, mid);//left subtree
    buildST(arr, 2 * index + 2, mid + 1, end);//right subtree
    tree[index] = tree[2 * index + 1] + tree[2 * index + 2];
    return tree[index];
  }

  public static int getSumUtil(int index, int si, int sj, int qi, int qj) {
    if (qj <= si || qi >= sj) {         //non-overlapping
      return 0;
    } else if (si >= qi && sj <= qj) {  //complete overlap
      return tree[index];
    } else {                            //partial overlap
      int mid = (si + sj) / 2;
      int left = getSumUtil(2*index+1, si, mid, qi, qj);
      int right = getSumUtil(2 * index + 2, mid + 1, sj, qi, qj);
      return left + right;
    }
  }
  public static int getSum(int arr[], int qi, int qj) {
    int n = arr.length;
    return getSumUtil(0,0, n - 1, qi, qj);

  }
  public static void main(String args[]) {
    int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
    int n = arr.length;
    init(n);
    buildST(arr, 0, 0, n - 1);
    for (int i = 0; i < tree.length; i++) {
      System.out.print(tree[i] + " ");
    }
    System.out.println();
    System.out.println("Sum between index 2 and 5 is "+ getSum(arr, 2, 5));;//calculate sum between index 2 and 5
  }
}
/* 
 * si:- starting index of segement tree
 * sj:- ending index of segement tree
 * qi:- starting query index 
 * qj:- ending query index
 */