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
  int sum = 0;
  int maxLength = 0;
  vector<int> maxSubarray;
  for (int i = 0; i < n; i++)
  {
    sum += arr[i];
    if (sum == k)
    {
      if (maxLength < i + 1)
      {
        maxLength = i + 1;
        maxSubarray = arr;
        return make_pair(maxLength, maxSubarray);
      }
    }
    if (sum > k)
    {
      int j = 0;
      while (sum > k && j < i)
      {
        sum -= arr[j];
        j++;
      }
      if (sum == k)
      {
        if (maxLength < i - j + 1)
        {
          maxLength = i - j + 1;
          maxSubarray = vector<int>(arr.begin() + j, arr.begin() + i +
                                                         1);
          return make_pair(maxLength, maxSubarray);
        }
      }
    }
  }
  return make_pair(maxLength, maxSubarray);
}
int main()
{
  vector<int> arr = {2, 3, 5};
  int k = 5;
  pair<int, vector<int>> result = getLongestSubarray(arr, k);
  cout << "Length of the longest subarray with sum " << k << " is " <
}
}