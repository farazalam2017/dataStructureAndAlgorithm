/* Statement:- Program to reverse a number */
/* ---------------------------------------- */
/* Created By Visual Studio Code
Author:- Faraz Alam
Email:- farazalam2017@gmail.com
Date: 2025-02-04 09:33:01
Title: reverseNumber.cpp */
/* ---------------------------------------- */
/* ---------------------------------------- */
#include <iostream>
using namespace std;
int main()
{
  int number;
  int reverseNumber = 0;
  cout << "Enter the number:- ";
  cin >> number;
  int originalNumber = number;
  while (number > 0)
  {
    int lastDigit = number % 10;
    reverseNumber = (reverseNumber * 10) + lastDigit;
    number = number / 10;
  }
  cout << "Reverse of " << originalNumber << " is " << reverseNumber;
}