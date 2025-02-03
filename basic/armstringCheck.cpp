/* Statement:- Check whether entered number if armstrong or not */
/* -------------------------------------------- */
/* -------------------------------------------- */
/*Armstrong number is number that is equal to the sum of digits, each raised to the power of the number of digits.*/
/* -------------------------------------------- */
/* -------------------------------------------- */
/* Created By Visual Studio Code
Author:- Faraz Alam
Email:- farazalam2017@gmail.com
Date: 2025-02-03 09:56:36
Title: armstringCheck.cpp */
/* -------------------------------------------- */
/* -------------------------------------------- */
#include <iostream>/* for input/output operations */
#include <cmath>   /* for mathematical operations */
using namespace std;
int main()
{
  int number;
  int lastDigit;
  int sumOfDigit = 0;
  int countOfDigit;
  int temporary;
  cout << "Enter the number" << "\n";
  cin >> number;
  if (number < 0)
  {
    cout << "We cannot find armstrong number for negative number" << "\n";
    exit(0);
  }
  temporary = number;
  countOfDigit = (int)(log10(number) + 1);
  while (temporary > 0)
  {
    lastDigit = temporary % 10;
    sumOfDigit = sumOfDigit + pow(lastDigit, countOfDigit);
    temporary = temporary / 10;
  }
  if (sumOfDigit == number)
  {
    cout << "The number is armstrong" << "\n";
  }
  else
  {
    cout << "The number is not armstrong" << "\n";
  }
}