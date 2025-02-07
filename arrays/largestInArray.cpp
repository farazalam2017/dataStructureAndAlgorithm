/* statement:- find largest number in array */
/* --------------------------------------- */
/* --------------------------------------- */
/* Created By:-  Visual Studio Code
Author:- Faraz Alam
Email:- farazalam2017@gmail.com
GitHub Repo:- https://github.com/farazalam2017/dataStructureAndAlgorithm
Date: 2025-02-06 10:16:44
Title: largestInArray.cpp */
/* --------------------------------------- */
/* --------------------------------------- */
#include <iostream>
#include <limits.h>/* for INT_MIN */
using namespace std;
int findLargestElement(int arr[], int n)
{
  int max = INT_MIN;
  for (int i = 0; i < n; i++)
  {
    if (arr[i] > max)
    {
      max = arr[i];
    }
  }
  return max;
}
int main()
{
  int arr[] = {2, 5, 1, 3, 0};
  int n = 5;
  int max = findLargestElement(arr, n);
  cout << "Largest element in array is:- " << max;
}