/* statement:- find the smallest and largest in array  */
/* ----------------------------------------- */
/* ----------------------------------------- */
/* Created By:-  Visual Studio Code
Author:- Faraz Alam
Email:- farazalam2017@gmail.com
GitHub Repo:- https://github.com/farazalam2017/dataStructureAndAlgorithm
Date: 2025-02-06 10:36:24
Title: secondSmallestAndLargest.cpp */
/* ----------------------------------------- */
/* ----------------------------------------- */
#include <iostream>
#include <limits.h>
using namespace std;
int secondSmallest(int arr[], int n)
{
  int small = INT_MAX;
  int s_small = INT_MAX;
  for (int i = 0; i < n; i++)
  {
    if (arr[i] < small)
    {
      s_small = small;
      small = arr[i];
    }
    else if (arr[i] < s_small && arr[i] != small)
    {
      s_small = arr[i];
    }
  }
  return s_small;
}
int secondLargest(int arr[], int n)
{
  int large = INT_MIN;
  int s_large = INT_MIN;
  for (int i = 0; i < n; i++)
  {
    if (arr[i] > large)
    {
      s_large = large;
      large = arr[i];
    }
    else if (arr[i] > s_large && arr[i] != large)
    {
      s_large = large;
    }
  }
  return s_large;
}
int main()
{
  int arr[] = {1, 2, 4, 7, 7, 5};
  int n = sizeof(arr) / sizeof(arr[0]);
  int sS = secondSmallest(arr, n);
  int sL = secondLargest(arr, n);
  cout << "Second smallest is " << sS << endl;
  cout << "Second largest is " << sL << endl;
  return 0;
}