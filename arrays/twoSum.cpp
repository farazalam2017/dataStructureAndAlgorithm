/* statement:- check if a pair with given sum exist in array or not */
/* --------------------------------------- */
/* --------------------------------------- */
/* Created By:-  Visual Studio Code
Author:- Faraz Alam
Email:- farazalam2017@gmail.com
GitHub Repo:- https://github.com/farazalam2017/dataStructureAndAlgorithm
Date: 2025-02-09 14:17:59
Title: twoSum.cpp */
/* --------------------------------------- */
/* --------------------------------------- */
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
string twoSum(int n, vector<int> &arr, int target)
{
  sort(arr.begin(), arr.end());
  int left = 0, right = n - 1;
  while (left < right)
  {
    int sum = arr[left] + arr[right];
    if (sum == target)
    {
      return "Yes";
    }
    else if (target > sum)
      left++;
    else
      right--;
  }
  return "No";
}
int main()
{
  vector<int> arr = {2, 6, 5, 8, 11};
  int n = arr.size();
  int target = 14;
  string ans = twoSum(n, arr, target);
  cout << ans;
}