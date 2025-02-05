/* Statement:-Program to check number is palindrome or not  */
/* ------------------------------- */
/* ------------------------------- */
/* Created By Visual Studio Code
Author:- Faraz Alam
Email:- farazalam2017@gmail.com
Date: 2025-02-04 09:26:39
Title: palindromeCheck.cpp */
/* ------------------------------- */
#include <iostream>
using namespace std;
int main()
{
  int number;
  int reverseNumber = 0;
  int temp;
  cout << "Enter the number: ";
  cin >> number;
  temp = number;
  while (temp > 0)
  {
    int lastDigit = temp % 10;
    reverseNumber = reverseNumber * 10 + lastDigit;
    temp = temp / 10;
  }
  if (reverseNumber == number)
  {
    cout << "Yes it is palindrome" << "\n";
  }
  else
  {
    cout << "No it is not palindrome" << "\n";
  }
}