/* statement:-Given an array find the contiguous subarray which has the largest sum and return its sum and print the subarray */
/* ----------------------------------- */
/* ----------------------------------- */
/* example;- arr[]={-2,1,-3,4,-1,2,1,-5,4}, subarray=[4 -1 2 1], sum = 6  */
/* ----------------------------------- */
/* ----------------------------------- */
/* Created By:-  Visual Studio Code
Author:- Faraz Alam
Email:- farazalam2017@gmail.com
GitHub Repo:- https://github.com/farazalam2017/dataStructureAndAlgorithm
Date: 2025-02-10 10:42:45
Title: maxSubarraySum.cpp */
#include <iostream>
#include <limits.h>
using namespace std;
int maxSubarraySum(int arr[], int n)
{
  int maxi = INT_MIN;
  int sum = 0;
  int start = 0;
  int ansStart = -1, ansEnd = -1;
  for (int i = 0; i < n; i++)
  {
    if (sum == 0)
    {
      start = i;
    }
    sum = sum + arr[i];
    if (sum > maxi)
    {
      maxi = sum;
      ansStart = start;
      ansEnd = i;
    }
    if (sum < 0)
    {
      sum = 0;
    }
  }
  cout << "Subarray is:- [";
  for (int i = ansStart; i <= ansEnd; i++)
  {
    cout << arr[i] << " ";
  }
  cout << "]";
  return maxi;
}
int main()
{
  int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
  int n = sizeof(arr) / sizeof(arr[0]);
  int maxSum = maxSubarraySum(arr, n);
  cout << "\n Maximum subarray is:- " << maxSum << "\n";
}