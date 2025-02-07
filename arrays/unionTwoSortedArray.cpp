/* statement;- union of two sorted arrays */
/* --------------------------------------- */
/* --------------------------------------- */
/* Created By:-  Visual Studio Code
Author:- Faraz Alam
Email:- farazalam2017@gmail.com
GitHub Repo:- https://github.com/farazalam2017/dataStructureAndAlgorithm
Date: 2025-02-07 11:03:22
Title: unionTwoSortedArray.cpp */
/* --------------------------------------- */
/* --------------------------------------- */
#include <iostream>
#include <vector>
using namespace std;
vector<int> FindUnion(int arr1[], int arr2[], int n, int m)
{
  int i = 0, j = 0;
  vector<int> Union;
  while (i < n && j < m)
  {
    if (arr1[i] < arr2[j])
    {
      if (Union.size() == 0 || Union.back() != arr1[i])
      {
        Union.push_back(arr1[i]);
      }
      i++;
    }
    else
    {
      if (Union.size() == 0 || Union.back() != arr2[j])
      {
        Union.push_back(arr2[j]);
      }
      j++;
    }
  }
  while (i < n)
  {
    if (Union.back() != arr1[i])
    {
      Union.push_back(arr1[i]);
    }
    i++;
  }
  while (j < m)
  {
    if (Union.back() != arr2[j])
    {
      Union.push_back(arr2[j]);
    }
    j++;
  }
  return Union;
}
int main()
{
  int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
  int arr2[] = {2, 3, 4, 4, 5, 11, 12};
  int n = sizeof(arr1) / sizeof(arr1[0]);
  int m = sizeof(arr2) / sizeof(arr2[0]);
  vector<int> Union = FindUnion(arr1, arr2, n, m);
  cout << "Union of arr1 and arr2 is:- " << "\n";
  for (auto &val : Union)
  {
    cout << val << " ";
  }
}