/* statement:- Given size of array N.Find the highest and lowest frequency element */
/* ----------------------------------------- */
/* ----------------------------------------- */
/* example:- [10,5,10,15,10,5] gives 10(3 times), 15(1 times)  */
/* ----------------------------------------- */
/* ----------------------------------------- */
/* Created By:-  Visual Studio Code
Author:- Faraz Alam
Email:- farazalam2017@gmail.com
GitHub Repo:- https://github.com/farazalam2017/dataStructureAndAlgorithm
Date: 2025-02-05 11:13:36
Title: highestAndLowestFrequnency.cpp */
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
  int maxFrequency = 0, minFrequency = n;
  int maxElement = 0, minElement = 0;
  for (auto it : mpp)
  {
    int count = it.second;
    int element = it.first;
    if (count > maxFrequency)
    {
      maxElement = element;
      maxFrequency = count;
    }
    if (count < minFrequency)
    {
      minElement = element;
      minFrequency = count;
    }
  }
  cout << "The highest frequency element:- " << maxElement << "\n";
  cout << "The lowest frequency elememt:- " << minElement << "\n";
}
int main()
{
  int arr[] = {10, 5, 10, 15, 10, 5};
  int n = sizeof(arr) / sizeof(arr[0]);
  frequency(arr, n);
}