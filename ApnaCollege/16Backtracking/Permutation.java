/* Find and print all the permutation of string
 * "abc"=> abc,acb,bac,bca,cab,cba. for n element permutation is n!
 */
public class Permutation {
  public static void findPerm(String str, String ans) {
    //base case
    if (str.length() == 0) {
      System.out.println(ans);
      return;
    }
    //recursion
    for (int i = 0; i < str.length(); i++) {
      char curr = str.charAt(i);
      //"abcde"="ab"+"de"="abde"
      String Newstr = str.substring(0, i) + str.substring(i + 1);
      findPerm(Newstr, ans+curr);
    }
  }
  public static void main(String[] args) {
    String str = "abc";
    findPerm(str, " ");
  }
}
