/* statement:- Sort an array using selection sort */
/* ----------------------------------- */
/* ----------------------------------- */
/* Created By:-  Visual Studio Code
Author:- Faraz Alam
Email:- farazalam2017@gmail.com
GitHub Repo:- https://github.com/farazalam2017/dataStructureAndAlgorithm
Date: 2025-02-05 14:38:27
Title: selectionSort.cpp */
/* ----------------------------------- */
#include <iostream>
using namespace std;
void function(int arr[], int n)
{
  for (int i = 0; i <= n - 2; i++)
  {
    int min = i;
    for (int j = i; j <= n - 1; j++)
    {
      if (arr[min] > arr[j])
      {
        min = j;
      }
    }
    int temp = arr[i];
    arr[i] = arr[min];
    arr[min] = temp;
  }
}
void print(int arr[], int n)
{
  for (int i = 0; i < n; i++)
  {
    cout << arr[i] << " ";
  }
}
int main()
{
  int arr[] = {5, 3, 8, 2, 4, 1, 5};
  int n = sizeof(arr) / sizeof(arr[0]);
  function(arr, n);
  print(arr, n);
}