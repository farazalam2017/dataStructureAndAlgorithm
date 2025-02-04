/* Statement:- Program to check whether a number is prime or not. */
/* ---------------------------------------- */
/* Created By Visual Studio Code
Author:- Faraz Alam
Email:- farazalam2017@gmail.com
Date: 2025-02-04 08:52:46
Title: primeCheck.cpp */
/* ---------------------------------------- */
/* ---------------------------------------- */
#include <iostream>
using namespace std;
int main()
{
  int number;
  bool BOOL = true;
  cout << "Enter the number:- " << "\n";
  cin >> number;
  if (number < 0)
  {
    cout << "Negative integer cannot be prime " << "\n";
  }
  for (int i = 2; i * i <= number; i++)
  {
    if ((number % i) == 0)
    {
      BOOL = false;
    }
  }
  (BOOL == true) ? cout << "The number is prime" : cout << "The number is not prime";
}