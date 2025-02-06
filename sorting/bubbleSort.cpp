/* Statement:- Sort an array using bubble Sort */
/* ---------------------------------------- */
/* ---------------------------------------- */
/* Created By:-  Visual Studio Code
Author:- Faraz Alam
Email:- farazalam2017@gmail.com
GitHub Repo:- https://github.com/farazalam2017/dataStructureAndAlgorithm
Date: 2025-02-05 11:58:08
Title: bubbleSort.cpp */
/* ---------------------------------------- */
/* ---------------------------------------- */
#include <iostream>
using namespace std;
void Sort(int arr[], int n)
{
  for (int i = 0; i < n - 1; i++)
  {
    for (int j = 0; j < n - 1 - i; j++)
    {
      if (arr[j] > arr[j + 1])
      {
        int temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
      }
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
  int arr[] = {7, 4, 7, 3, 6, 5, 4, 7};
  int n = sizeof(arr) / sizeof(arr[0]);
  Sort(arr, n);
  print(arr, n);
}