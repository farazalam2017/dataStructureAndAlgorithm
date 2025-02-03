/* Statement:- Count the of digit in a entered number */
/* ----------------------------------------------------- */
/* ----------------------------------------------------- */
/* ----------------------------------------------------- */
/* Created By Visual Studio Code
Author:- Faraz Alam
Email:- farazalam2017@gmail.com
Date: 2025-02-03 09:23:24
Title: countDigitInNumber.cpp */
/* ----------------------------------------------------- */
/* ----------------------------------------------------- */
#include <iostream> //for input/output
#include <cmath>    //for log10 (), abs() function
using namespace std;
int main()
{
  int number;
  int numberofDigit;
  cout << "Enter the number" << "\n";
  cin >> number;
  if (number == 0)
  {
    cout << "Number of digit is 1" << "\n";
  }
  else if (number < 0)
  {

    cout << "Number of digit in " << number << " is " << (int)(log10(abs(number)) + 1);
  }
  else
  {
    cout << "Number of digit in " << number << " is " << (int)(log10(number) + 1);
  }
}