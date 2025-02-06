/* statement:- Left Rotate an array by one place */
/* -------------------------------------- */
/* -------------------------------------- */
/* example:- [1,2,3,4,5]=> [2,3,4,5,1] */
/* -------------------------------------- */
/* -------------------------------------- */
/* Created By:-  Visual Studio Code
Author:- Faraz Alam
Email:- farazalam2017@gmail.com
GitHub Repo:- https://github.com/farazalam2017/dataStructureAndAlgorithm
Date: 2025-02-06 12:05:42
Title: leftRotateByOnePlace.cpp */
/* -------------------------------------- */
/* -------------------------------------- */
#include <iostream>
using namespace std;
void rotate(int arr[], int n)
{
  int temp = arr[0];
  for (int i = 0; i < n - 1; i++)
  {
    arr[i] = arr[i + 1];
  }
  arr[n - 1] = temp;
  for (int i = 0; i < n; i++)
  {
    cout << arr[i] << " ";
  }
}
int main()
{
  int arr[] = {1, 2, 3, 4, 5};
  int n = sizeof(arr) / sizeof(arr[0]);
  rotate(arr, n);
}