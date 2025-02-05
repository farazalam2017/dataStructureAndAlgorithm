/* Statement:- Program to print N to 1 using recursion */
/* --------------------------------- */
/* --------------------------------- */
/* Created By Visual Studio Code
Author:- Faraz Alam
Email:- farazalam2017@gmail.com
Date: 2025-02-04 10:39:54
Title: printNto1.cpp */
/* --------------------------------- */
/* --------------------------------- */
#include <iostream>
using namespace std;
void function(int n, int i)
{
  if (n < i)
    return;
  cout << n << " ";
  function(n - 1, i);
}
int main()
{
  int number;
  cout << "Enter the number:- ";
  cin >> number;
  function(number, 1);
}