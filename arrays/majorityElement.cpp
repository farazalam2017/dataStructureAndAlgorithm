/* statement:- Program to return element that occurs more than (sizeOfArray/2) times in an array */
/* -------------------------------------- */
/* -------------------------------------- */
/* example:- arr[]={2,2,3,3,1,2,2}, N=7, ans= 2 (appears 4 times which is greater than 7/2 ~ 3 ) */
/* ------------------------------------- */
/* ------------------------------------- */
/* Created By:-  Visual Studio Code
Author:- Faraz Alam
Email:- farazalam2017@gmail.com
GitHub Repo:- https://github.com/farazalam2017/dataStructureAndAlgorithm
Date: 2025-02-10 09:36:53
Title: majorityElement.cpp */
#include <iostream>
#include <vector>
using namespace std;
int majorityElement(vector<int> v)
{
  int n = v.size();
  int count = 0;  
  int element;
  for (int i = 0; i < n; i++)
  {
    if (count == 0)
    {
      count = 1;
      element = v[i];
    }
    else if (element == v[i])
      count++;
    else
    {
      count--;
    }
  }
  int count1 = 0;
  for (int i = 0; i < n; i++)
  {
    if (v[i] == element)
    {
      count1++;
    }
  }
  if (count1 > (n / 2))
    return element;
  return -1;
}
int main()
{
  vector<int> arr = {2, 2, 1, 1, 1, 2, 2};
  int ans = majorityElement(arr);
  cout << "Majority Element is:- " << ans << endl;
}