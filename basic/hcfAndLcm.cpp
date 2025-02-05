/* Statement:- Find the hcf and lcm of a entered numbers */
/* ------------------------------------------- */
/* ------------------------------------------- */
/* Created By Visual Studio Code
Author:- Faraz Alam
Email:- farazalam2017@gmail.com
Date: 2025-02-03 11:23:26
Title: hcfAndLcm.cpp */
/* ------------------------------------------- */
/* ------------------------------------------- */
#include <iostream>
using namespace std;
int main()
{
  int number1, number2;
  int temp1, temp2;
  int HCF;
  int LCM;
  cout << "Enter the number:- ";
  cin >> number1 >> number2;
  temp1 = number1;
  temp2 = number2;
  while (temp1 > 0 && temp2 > 0)
  {
    if (temp1 > temp2)
    {
      temp1 = temp1 % temp2;
    }
    else
    {
      temp2 = temp2 % temp1;
    }
  }
  (temp1 == 0) ? HCF = temp2 : HCF = temp1;
  LCM = (int)((number1 * number2) / HCF);
  cout << "HCF is:- " << HCF << endl;
  cout << "LCM is:- " << LCM << endl;
}
