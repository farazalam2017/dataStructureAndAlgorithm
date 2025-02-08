/* statement:- Intersection of two sorted arrays */
/* ---------------------------------------- */
/* ---------------------------------------- */
/* example:- A={1,2,3,3,4,5,6} B={3,3,5 } ans={3,3,5}(occur in both)*/
/* ---------------------------------------- */
/* ---------------------------------------- */
/* Created By:-  Visual Studio Code
Author:- Faraz Alam
Email:- farazalam2017@gmail.com
GitHub Repo:- https://github.com/farazalam2017/dataStructureAndAlgorithm
Date: 2025-02-08 09:26:57
Title: intersectionOfTwoArrays.cpp */
/* ---------------------------------------- */
/* ---------------------------------------- */
#include <iostream>
#include <vector>
using namespace std;
vector<int> intersectionOfArray(vector<int> A, vector<int> B)
{
  vector<int> ans;
  int i = 0;
  int j = 0;
  while (i < A.size() && j < B.size())
  {
    if (A[i] < B[j])
    {
      i++;
    }
    else if (A[i] > B[j])
    {
      j++;
    }
    else
    {
      ans.push_back(A[i]);
      i++;
      j++;
    }
  }
  return ans;
}
int main()
{
  vector<int> A{1, 2, 3, 3, 4, 5, 6, 7};
  vector<int> B{3, 3, 4, 4, 5, 8};
  vector<int> ans = intersectionOfArray(A, B);
  for (int i = 0; i < ans.size(); i++)
  {
    cout << ans[i] << " ";
  }
}