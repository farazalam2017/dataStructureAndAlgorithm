/* statement:-movea all zeroes to end of array  */
/* --------------------------------------- */
/* --------------------------------------- */
/* Created By:-  Visual Studio Code
Author:- Faraz Alam
Email:- farazalam2017@gmail.com
GitHub Repo:- https://github.com/farazalam2017/dataStructureAndAlgorithm
Date: 2025-02-07 10:07:17
Title: moveAllZeroToEnd.cpp */
/* --------------------------------------- */
/* --------------------------------------- */
#include <iostream>
#include <vector>
using namespace std;
vector<int> moveZeroes(int n, vector<int> arr)
{
  int j = -1;
  for (int i = 0; i < n; i++)
  {
    if (arr[i] == 0)
    {
      j = i;
      break;
    }
  }
  if (j == -1)
    return arr;
  for (int i = j + 1; i < n; i++)
  {
    if (arr[i] != 0)
    {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      j++;
    }
  }
  return arr;
}
int main()
{
  vector<int> arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
  int n = arr.size();
  vector<int> ans = moveZeroes(n, arr);
  for (auto &it : ans)
  {
    cout << it << " ";
  }
  cout << "\n";
}
