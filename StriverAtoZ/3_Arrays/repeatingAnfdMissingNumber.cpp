#include <iostream>
#include<vector>
using namespace std;
vector<int> findMissingNumber(vector<int> a){
  long long n = a.size();
  long long sn= (n*(n+1))/2;
  long long s2n = (n * (n + 1) * (2 * n + 1)) / 6;
  long long s = 0, s2 = 0;
  for (int i = 0; i < n;i++){
    s = s + a[i];
    s2 = s2 + ((long long)a[i] * (long long)a[i]);
  }
  int value1 = s - sn;
  int value2 = s2 - s2n;
  value2 = value2 / value1;
  long long X = (value1 + value2) / 2;
  long long Y = X - value1;
  return {(int)X, (int)Y};
}
int main()
{
  vector<int> a = {4,3,6,2,1,1};
    vector<int> ans =  findMissingNumber(a);
    cout << "The repeating and missing numbers are: {"
         << ans[0] << ", " << ans[1] << "}\n";
    return 0;
}