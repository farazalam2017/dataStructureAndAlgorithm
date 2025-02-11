/* statement:- Given an array with equal number of positives and negatives elements. Without altering relative order of positive and negative elements return an array of alternate positive and negative values. Start with positive values */
/* --------------------------------------- */
/* --------------------------------------- */
/* example:= arr[]={3,1,-2,-5,2,-4}, arr=[3,-2,1,-3,2,-4] */
/* --------------------------------------- */
/* --------------------------------------- */
/* Created By:-  Visual Studio Code
Author:- Faraz Alam
Email:- farazalam2017@gmail.com
GitHub Repo:- https://github.com/farazalam2017/dataStructureAndAlgorithm
Date: 2025-02-11 14:14:36
Title: rearrangeElementsBySign.cpp */
#include <iostream>
#include <vector>
using namespace std;
// for equal number of positives and negatives
/* vector<int> rearrangeBySign(vector<int> A)
{
  int n = A.size();
  vector<int> ans(n, 0);
  int positiveIndex = 0, negativeIndex = 1;
  for (int i = 0; i < n; i++)
  {
    // fill negative element in odd indices and increment by 2
    if (A[i] < 0)
    {
      ans[negativeIndex] = A[i];
      negativeIndex += 2;
    }
    else
    {
      // fill posotive element in even indices and incremement by 2
      ans[positiveIndex] = A[i];
      positiveIndex += 2;
    }
  }
  return ans;
} */
// for unequal number of positives and negatives
vector<int> rearrangeBySign(vector<int> A, int n)
{
  // 1.
  vector<int> positive;
  vector<int> negative;
  for (int i = 0; i < n; i++)
  {
    if (A[i] > 0)
    {
      positive.push_back(A[i]);
    }
    else
    {
      negative.push_back(A[i]);
    }
  }
  if (negative.size() > positive.size())
  {
    for (int i = 0; i < positive.size(); i++)
    {
      A[2 * i] = positive[i];
      A[2 * i + 1] = negative[i];
    }
    int index = positive.size() * 2;
    for (int i = positive.size(); i < negative.size(); i++)
    {
      A[index] = negative[i];
      index++;
    }
  }
  else
  {
    for (int i = 0; i < negative.size(); i++)
    {
      A[2 * i] = positive[i];
      A[2 * i + 1] = negative[i];
    }
    int index = negative.size() * 2;
    for (int i = negative.size(); i < positive.size(); i++)
    {
      A[index] = positive[i];
      index++;
    }
  }
  return A;
}
int main()
{
  vector<int> arr = {3, 1, -2, -5, 2, -4, 8, -1, -2, 6, 1};
  int n = arr.size();
  vector<int> ans = rearrangeBySign(arr, n);
  for (int i = 0; i < ans.size(); i++)
  {
    cout << ans[i] << " ";
  }
  return 0;
}