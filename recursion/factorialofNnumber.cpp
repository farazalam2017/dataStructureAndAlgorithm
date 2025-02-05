/* Statement:- Program to find the factorial of a number */
/* ----------------------------------------- */
/* ----------------------------------------- */
/* Created By:-  Visual Studio Code
Author:- Faraz Alam
Email:- farazalam2017@gmail.com
GitHub Repo:- https://github.com/farazalam2017/dataStructureAndAlgorithm
Date: 2025-02-04 11:08:26
Title: factorialofNnumber.cpp */
/* ----------------------------------------- */
/* ----------------------------------------- */
#include <iostream>
using namespace std;
int function(int n, int product)
{
  if (n < 1)
  {
    return product;
  }
  function(n - 1, product * n);
}
int main()
{
  int number;
  int product = 1;
  cout << "Enter the number:- ";
  cin >> number;
  if (number < 0)
  {
    cout << "Factorial of negative number is not defined";
    exit(0);
  }
  cout << "Factorial of " << number << " is " << function(number, product);
}