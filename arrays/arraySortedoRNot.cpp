/* statement:- check if an array is sorted or not */
/* ------------------------------------ */
/* ------------------------------------ */
/* Created By:-  Visual Studio Code
Author:- Faraz Alam
Email:- farazalam2017@gmail.com
GitHub Repo:- https://github.com/farazalam2017/dataStructureAndAlgorithm
Date: 2025-02-06 11:14:24
Title: arraySortedoRNot.cpp */
/* ------------------------------------ */
/* ------------------------------------ */
#include <iostream>
using namespace std;
bool isSorted(int arr[], int n)
{
  for (int i = 1; i < n; i++)
  {
    if (arr[i - 1] > arr[i])
    {
      return false; // 0 for not sorted
    }
  }
  return true; // 1 for if sorted
}
int main()
{
  int arr[] = {1, 2, 3, 4, 5};
  int n = sizeof(arr) / sizeof(arr[0]);
  cout << isSorted(arr, n);
}
