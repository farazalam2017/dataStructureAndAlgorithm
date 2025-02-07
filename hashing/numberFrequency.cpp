/* Statement:- In an array count how many times particular element occur using query to show array hashing*/
/* --------------------------------------------- */
/* --------------------------------------------- */
/* example:- arr[]=[1,2,1,3,2] | queries[]= [1,3,4,2,10] = ans[]=[2,1,0,2,0] [1 from queries[] occur two times in arr[], 3 from queries[] occur 1 times and so on ]  */
/* --------------------------------------------- */
/* Created By:-  Visual Studio Code
Author:- Faraz Alam
Email:- farazalam2017@gmail.com
GitHub Repo:- https://github.com/farazalam2017/dataStructureAndAlgorithm
Date: 2025-02-05 09:26:59
Title: numberFrequency.cpp */
/* --------------------------------------------- */
/* --------------------------------------------- */
#include <iostream>
using namespace std;
const int MAX_VALUE = 100; // to deal with cases when elements are large
int main()
{
  int lengthofArray;
  cout << "Enter the length of array:- ";
  cin >> lengthofArray;
  int arr[lengthofArray];
  cout << "Enter " << lengthofArray << " elements in array " << "\n";
  for (int i = 0; i < lengthofArray; i++)
  {
    cin >> arr[i];
  }
  // pre-compute
  int hash[MAX_VALUE + 1] = {0};
  for (int i = 0; i < lengthofArray; i++)
  {
    hash[arr[i]]++;
  }
  int queryArraySize;
  cout << "Enter the length of query Array" << "\n";
  cin >> queryArraySize;
  cout << "Enter " << queryArraySize << " elements in query array" << "\n";
  while (queryArraySize--)
  {
    int number;
    cout << "Enter element:- ";
    cin >> number;
    // fetching
    cout << "Element " << number << " occur " << hash[number] << " times " << "\n";
  }
  return 0;
}