/* statement:- Given an array , print the elemenets which are leader. A leader is an element that is greater than all of the elements on the right side of array */
/* -------------------------------------- */
/* -------------------------------------- */
/* example:- [4,7,1,0] = [7, 1, 0] */
/* -------------------------------------- */
/* -------------------------------------- */
/* Created By:-  Visual Studio Code
Author:- Faraz Alam
Email:- farazalam2017@gmail.com
GitHub Repo:- https://github.com/farazalam2017/dataStructureAndAlgorithm
Date: 2025-02-16 09:37:19
Title: leadersInArray.cpp */
#include <iostream>
#include <vector>
using namespace std;
vector<int> printLeaders(int arr[], int n)
{
  vector<int> ans;
  int max = arr[n - 1];
  ans.push_back(arr[n - 1]);
  for (int i = n - 2; i >= 0; i--)
  {
    if (arr[i] > max)
    {
      ans.push_back(arr[i]);
      max = arr[i];
    }
    return ans;
  }
}
int main()
{
  int n = 6;
  int arr[n] = {10, 22, 12, 3, 0, 6};
  vector<int> ans = printLeaders(arr, n);
  for (int i = ans.size() - 1; i >= 0; i--)
  {
    cout << ans[i] << " ";
  }

  cout << endl;
  return 0;
}