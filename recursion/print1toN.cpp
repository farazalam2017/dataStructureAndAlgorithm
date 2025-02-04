/* Statement:- Program to print 1 to N using recursion */
/* --------------------------------------- */
/* --------------------------------------- */
/* Created By Visual Studio Code
Author:- Faraz Alam
Email:- farazalam2017@gmail.com
Date: 2025-02-04 10:33:51
Title: print1toN.cpp */
/* --------------------------------------- */
/* --------------------------------------- */
#include <iostream>
using namespace std;
void function(int i, int n)
{
  if (i > n)
    return;
  cout << i << " ";
  function(i + 1, n);
}
int main()
{
  int number;
  cout << "Enter a number: ";
  cin >> number;
  function(1, number);
}