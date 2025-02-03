/* Satatement;- Count the number of divisors of a number */
/* ---------------------------- */
/* ---------------------------- */
/* Created By Visual Studio Code
Author:- Faraz Alam
Email:- farazalam2017@gmail.com
Date: 2025-02-03 10:23:41
Title: printAllDivisors.cpp */
/* ---------------------------- */
/* ---------------------------- */
#include <iostream>
using namespace std;
int main()
{
  int number;
  int count = 0;
  cout << "Enter the number" << "\n";
  cin >> number;
  cout << "The Divisors are:- ";
  for (int i = 1; i * i <= number; i++)
  {
    if (number % i == 0)
    {
      count++;
      cout << i << " ";
    }
    if ((number / i) != i)
    {
      count++;
      cout << number / i << " ";
    }
  }
  cout << "\n"
       << " And the number of divisors of " << number << " is " << count;
}