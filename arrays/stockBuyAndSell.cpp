/* statement:- Given an array where prices[i] is the price of given stock on ith day */
/* ------------------------------------------- */
/* ------------------------------------------- */
/* example:- prices = [7,1,5,3,6,4], output: 5(day 5 price (6) - day 2 price (1)) */
/* ------------------------------------------- */
/* ------------------------------------------- */
#include <iostream>
#include <limits.h>
#include <vector>
using namespace std;
int maxProfit(vector<int> &arr)
{
  int maxProfit = 0;
  int n = arr.size();
  int minPrice = INT_MAX;
  for (int i = 0; i < n; i++)
  {
    minPrice = min(minPrice, arr[i]);
    maxProfit = max(maxProfit, arr[i] - minPrice);
  }
  return maxProfit;
}
int main()
{
  vector<int> arr = {7, 1, 5, 3, 6, 4};
  int maxPro = maxProfit(arr);
  cout << "Max Profit is;- " << maxPro << "\n";
}