/* statement:- remove duplicate from sorted array */
/* --------------------------------------- */
/* --------------------------------------- */
/* example;- [1,1,2,2,2,3,3] => [1,2,3] */
/* --------------------------------------- */
/* --------------------------------------- */
/* Created By:-  Visual Studio Code
Author:- Faraz Alam
Email:- farazalam2017@gmail.com
GitHub Repo:- https://github.com/farazalam2017/dataStructureAndAlgorithm
Date: 2025-02-06 11:23:15
Title: removeDuplicate.cpp */
#include <iostream>
using namespace std;
int removeArray(int arr[], int n)
{
  int i = 0;
  for (int j = 1; j < n; j++)
  {
    if (arr[i] != arr[j])
    {
      i++;
      arr[i] = arr[j];
    }
  }
  return i + 1;
}
int main()
{
  int arr[] = {1, 1, 2, 2, 2, 3, 4, 4, 5};
  int n = sizeof(arr) / sizeof(arr[0]);
}