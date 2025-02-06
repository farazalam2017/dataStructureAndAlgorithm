/* Statement:- Count the characters (both uppercase and lowercase) in a string using given query  */
/* -------------------------------- */
/* -------------------------------- */
/* example:- In string "abcdabehf" and a query string "aghbc" character 'a' occur 2 times, 'g' occurs 0 times, 'h' occurs 1 times and so on in a string "abcdabehf" */
/* -------------------------------- */
/* -------------------------------- */
/* Created By:-  Visual Studio Code
Author:- Faraz Alam
Email:- farazalam2017@gmail.com
GitHub Repo:- https://github.com/farazalam2017/dataStructureAndAlgorithm
Date: 2025-02-05 09:57:31
Title: characterFrequency.cpp */
/* -------------------------------- */
/* -------------------------------- */
#include <iostream>
using namespace std;
int main()
{
  string s;
  cout << "Enter the string:- " << "\n";
  cin >> s;
  // precompute
  int hash[256] = {0};
  for (int i = 0; i < s.size(); i++)
  {
    hash[s[i]]++;
  }
  int queryArraySize;
  cout << "Enter the length of query character array" << "\n";
  cin >> queryArraySize;
  cout << "Enter " << queryArraySize << " elements in query character array" << "\n";
  while (queryArraySize--)
  {
    char ch;
    cout << "Enter characters:- ";
    cin >> ch;
    // fetching
    cout << "Element " << ch << " occur " << hash[ch] << " times " << "\n";
  }
}