/* statement:- Given an array of integer, rotate array of elements by k elements */
/* ---------------------------------- */
/* ---------------------------------- */
/* example:- [1,2,3,4,5,6,7], k= 2, right, [6,7,1,2,3,4,5] */
/* example:- [1,2,3,4,5,6,7], k=2, left, [3,4,5,6,7,1,2] */
/* ---------------------------------- */
/* ---------------------------------- */

/* Created By:-  Visual Studio Code
Author:- Faraz Alam
Email:- farazalam2017@gmail.com
GitHub Repo:- https://github.com/farazalam2017/dataStructureAndAlgorithm
Date: 2025-02-07 09:26:14
Title: rotatebyDplaces.cpp */
#include <iostream>
using namespace std;
void reverse(int arr[], int start, int end)
{
  while (start <= end)
  {
    int temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;
    start++;
    end--;
  }
}
void rotateToLeft(int arr[], int n, int k)
{
  // reverse first k elements
  reverse(arr, 0, k - 1);
  // reverse last (n-k) elements
  reverse(arr, k, n - 1);
  // reverse whole array
  reverse(arr, 0, n - 1);
}
void rotateToRight(int arr[], int n, int k)
{
  // reverse first (n-k) elements
  reverse(arr, 0, n - k - 1);
  // reverse last k elements
  reverse(arr, n - k, n - 1);
  // reverse whole array
  reverse(arr, 0, n - 1);
}
int main()
{
  int arr[] = {1, 2, 3, 4, 5, 6, 7};
  int n = sizeof(arr) / sizeof(arr[0]);
  int k = 2;
  rotateToLeft(arr, n, k);
  cout << "After Rotating the k elements to left :- " << "\n";
  for (int i = 0; i < n; i++)
  {
    cout << arr[i] << " ";
  }
  rotateToRight(arr, n, k);
  cout << "\n"
       << "After Rotating the k elements to right :- ";
  for (int i = 0; i < n; i++)
  {
    cout << arr[i] << " ";
  }
}