/* Statament:- Count the number of occurances of each element in array using maps */
/* ----------------------------------- */
/* ----------------------------------- */
/* example:[10,5,10,15,10,5] in this array 10 occur 3 times, 5 occur 2 times and 15 occur 1 times */
/* ----------------------------------- */
/* ----------------------------------- */
/* Created By:-  Visual Studio Code
Author:- Faraz Alam
Email:- farazalam2017@gmail.com
GitHub Repo:- https://github.com/farazalam2017/dataStructureAndAlgorithm
Date: 2025-02-05 10:39:46
Title: countFrequency.cpp */
/* ----------------------------------- */
/* ----------------------------------- */
#include <iostream>
#include <unordered_map>
using namespace std;
void frequency(int arr[], int n)
{
  unordered_map<int, int> mpp;
  for (int i = 0; i < n; i++)
  {
    mpp[arr[i]]++;
  }
  for (auto x : mpp)
  {
    cout << " Key:- " << x.first << " value:- " << " " << x.second << endl;
  }
}
int main()
{
  int arr[] = {10, 5, 10, 15, 10, 5};
  int n = sizeof(arr) / sizeof(arr[0]);
  frequency(arr, n);
}