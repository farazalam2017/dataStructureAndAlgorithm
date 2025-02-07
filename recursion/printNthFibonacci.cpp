/* Statement:- Program to print Nth number in Fibonacci series  */
/* ----------------------------------- */
/* ----------------------------------- */
/* Created By:-  Visual Studio Code
Author:- Faraz Alam
Email:- farazalam2017@gmail.com
GitHub Repo:- https://github.com/farazalam2017/dataStructureAndAlgorithm
Date: 2025-02-05 09:07:48
Title: printNthFibonacci.cpp */
/* ----------------------------------- */
/* ----------------------------------- */
#include <iostream>
using namespace std;
int function(int n)
{
  if (n <= 1)
  {
    return n;
  }
  return function(n - 1) + function(n - 2);
}
int main()
{
  int number;
  cout << "Enter the number:- " << "\n";
  cin >> number;
  cout << "The " << number << "th number in Fibonacci series is " << function(number);
}