#include <iostream>
#include <vector>
#include<algorithm>
#include <climits>
using namespace std;
int maxproductSubarray(vector<int> &arr){
  int n = arr.size();
  int preffix = 1;
  int suffix = 1;
  int ans = INT_MIN;
  for (int i = 0; i < n;i++){
    if(preffix==0)
      preffix = 1;
      if(suffix==0)
        suffix = 1;
      preffix *= arr[i];
      suffix *= arr[n-i-1];
      ans = max(ans, max(preffix, suffix));
  }
  return ans;
}
int main()
{
  vector<int> arr = {1, 2, -3, 0, -4, -5};
  cout << "The maximum product subarray is: "
         <<maxproductSubarray(arr) << "\n";
    return 0;
  return 0;
}