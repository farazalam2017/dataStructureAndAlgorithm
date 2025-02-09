/* statement:- Given an arrat and a sum k, print the length of longest subarray that sums to k and print that subarray also */
/* -------------------------------------- */
/* -------------------------------------- */
/* example:- N=3, k=5, arr[]={2,3,5}, ans=2 , subarray={2,3} */
/* -------------------------------------- */
/* -------------------------------------- */
/* Created By:-  Visual Studio Code
Author:- Faraz Alam
Email:- farazalam2017@gmail.com
GitHub Repo:- https://github.com/farazalam2017/dataStructureAndAlgorithm
Date: 2025-02-08 21:53:44
Title: longestSubArrayWithSumK.cpp */
#include <iostream>
#include <vector>
using namespace std;
pair<int, vector<int>> getLongestSubarray(vector<int> &arr, int k)
{
  int n = arr.size();
  int left = 0;
  int right = 0;
  int sum = arr[0];
  int maxLen = 0, startIndex = -1, endIndex = -1;
  while (right < n)
  {
    // 1.
    while (left <= right && sum > k)
    {
      sum -= arr[left];
      left++;
    }
    // 2.
    if (sum == k)
    {
      if (right - left + 1 > maxLen)
      {
        maxLen = right - left + 1;
        startIndex = left;
        endIndex = right;
      }
    }
    // 1.
    right++;
    if (right < n)
    {
      sum += arr[right];
    }
  }
  vector<int> subarray;
  if (startIndex != -1 && endIndex != -1)
  {
    for (int i = startIndex; i <= endIndex; i++)
    {
      subarray.push_back(arr[i]);
    }
  }
  return {maxLen, subarray};
}
int main()
{
  vector<int> arr = {2, 3, 4, 1, 9};
  int k = 10;
  auto result = getLongestSubarray(arr, k);
  cout << "Length of longest subarray is " << result.first << "\n";
  if (!result.second.empty())
  {
    cout << "Subarray is :- ";
    for (int num : result.second)
    {
      cout << num << " ";
    }
    cout << "\n";
  }
  else
  {
    cout << "No subarray found\n";
  }
}