/* statement:- Sort an array using insertion sort */
/* -------------------------------------- */
/* -------------------------------------- */
/* Created By:-  Visual Studio Code
Author:- Faraz Alam
Email:- farazalam2017@gmail.com
GitHub Repo:- https://github.com/farazalam2017/dataStructureAndAlgorithm
Date: 2025-02-05 20:43:46
Title: insertionSort.cpp */
/* -------------------------------------- */
/* -------------------------------------- */
#include <iostream>
using namespace std;
void function(int arr[], int n)
{
  for (int i = 0; i <= n - 1; i++)
  {
    int j = i;
    while (j > 0 && arr[j - 1] > arr[j])
    {
      int temp = arr[j - 1];
      arr[j - 1] = arr[j];
      arr[j] = temp;
      j--;
    }
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
  int arr[] = {5, 6, 2, 4, 8, 1};
  int n = sizeof(arr) / sizeof(arr[0]);
  function(arr, n);
  print(arr, n);
}