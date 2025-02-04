/* Statement:- Sum of first N number using recursion */
/* --------------------------------------- */
/* --------------------------------------- */
/* Created By:-  Visual Studio Code
Author:- Faraz Alam
Email:- farazalam2017@gmail.com
GitHub Repo:- https://github.com/farazalam2017/dataStructureAndAlgorithm
Date: 2025-02-04 10:50:24
Title: sumofFirstNnumber.cpp */
/* --------------------------------------- */
/* --------------------------------------- */
#include <iostream>
using namespace std;
int function(int n, int sum)
{
  if (n < 1)
  {
    return sum;
  }
  function(n - 1, sum + n);
}
int main()
{
  int number;
  int sum = 0;
  cout << "Enter the number:- ";
  cin >> number;
  if (number < 0)
  {
    cout << "Factorial of negative number is not defined";
  }
  cout << "Sum of first " << number << " number is " << function(number, sum);
}