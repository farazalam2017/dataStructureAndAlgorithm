/* Statement:- Program to print name n times using recursion */
/* ----------------------------------- */
/* ----------------------------------- */
/* Created By Visual Studio Code
Author:- Faraz Alam
Email:- farazalam2017@gmail.com
Date: 2025-02-04 10:04:55
Title: printNname.cpp */
/* ----------------------------------- */
#include <iostream>
using namespace std;
void function(int i, int n, string name)
{
  if (i > n)
    return;
  cout << name << " ";
  function(i + 1, n, name);
}
int main()
{
  int number;
  string name;
  cout << " Enter your name:- ";
  cin >> name;
  cout << "Enter the number of times you want to print " << name << ":- ";
  cin >> number;
  function(1, number, name);
}