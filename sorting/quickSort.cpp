/* statement:- sort an array using quick sort */
/* ---------------------------- */
/* ---------------------------- */

/* Created By:-  Visual Studio Code
Author:- Faraz Alam
Email:- farazalam2017@gmail.com
GitHub Repo:- https://github.com/farazalam2017/dataStructureAndAlgorithm
Date: 2025-02-05 21:41:44
Title: quickSort.cpp */
/* ---------------------------- */
/* ---------------------------- */
#include <iostream>
using namespace std;
void swap(int &a, int &b)
{
  int temp = a;
  a = b;
  b = temp;
}
int partition(int arr[], int low, int high)
{
  int pivot = arr[low];
  int i = low;
  int j = high;
  while (i < j)
  {
    while (arr[i] <= pivot && i < high)
    {
      i++;
    }
    while (arr[j] > pivot && j >= low)
    {
      j--;
    }
    if (j > i)
    {
      swap(arr[i], arr[j]);
    }
  }
  swap(arr[low], arr[j]);
  return j;
}
void quickSort(int arr[], int low, int high)
{
  if (low < high)
  {
    int p_index = partition(arr, low, high);
    quickSort(arr, low, p_index - 1);
    quickSort(arr, p_index + 1, high);
  }
}
int main()
{
  int arr[] = {5, 2, 9, 1, 7, 3};
  int n = sizeof(arr) / sizeof(arr[0]);
  cout << "Before sortin:- ";
  for (int i = 0; i < n; i++)
  {
    cout << arr[i] << " ";
  }
  cout << "\n";
  quickSort(arr, 0, n - 1);
  cout << "After sorting:-  ";
  for (int i = 0; i < n; i++)
  {
    cout << arr[i] << " ";
  }
  cout << "\n";
}