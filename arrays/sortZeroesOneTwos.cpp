/* statement:- Given array consisting of 0s, 1s and 2s. Write a program to sort without using sorting function */
/* ----------------------------------------------- */
/* ----------------------------------------------- */
/* Created By:-  Visual Studio Code
Author:- Faraz Alam
Email:- farazalam2017@gmail.com
GitHub Repo:- https://github.com/farazalam2017/dataStructureAndAlgorithm
Date: 2025-02-09 16:38:57
Title: sortZeroesOneTwos.cpp */
/* ----------------------------------------------- */
/* ----------------------------------------------- */
#include <iostream>
#include <vector>
using namespace std;
void sortArray(vector<int> &arr, int n)
{
  int count0 = 0, count1 = 0, count2 = 0;
  for (int i = 0; i < n; i++)
  {
    if (arr[i] == 0)
    {
      count0++;
    }
    else if (arr[i] == 1)
    {
      count1++;
    }
    else
    {
      count2++;
    }
  }
  for (int i = 0; i < count0; i++)
  {
    arr[i] = 0;
  }
  for (int i = count0; i < count0 + count1; i++)
  {
    arr[i] = 1;
  }
  for (int i = count0 + count1; i < n; i++)
  {
    arr[i] = 2;
  }
}
int main()
{
  vector<int> arr = {0, 2, 1, 2, 0, 1};
  int n = arr.size();
  cout << "Before sorting: " << "\n";
  for (int i = 0; i < n; i++)
  {
    cout << arr[i] << " ";
  }
  sortArray(arr, n);
  cout << "\n";
  cout << "After sorting: " << "\n";
  for (int i = 0; i < n; i++)
  {
    cout << arr[i] << " ";
  }
  cout << endl;
}