/* 

  4 4 4 4 4 4 4
  4 3 3 3 3 3 4
  4 3 2 2 2 3 4
  4 3 2 1 2 3 4
  4 3 2 2 2 3 4
  4 3 3 3 3 3 4
  4 4 4 4 4 4 4
 */
#include <iostream>
#include<algorithm>
using namespace std;

int main()
{
  int x;
  cin >> x;
  for (int i = 0; i < 2 * x - 1;i++){
    for (int j = 0; j < 2 * x - 1;j++){
      int top = i;
      int bottom = j;
      int right = (2 * x-2) - j;
      int left = (2 * x-2) - i;
      int temp = (x- min(min(top,bottom), min(left,right)));
      cout << temp<<" ";
    }
    cout << endl;
  }
    return 0;
} 
