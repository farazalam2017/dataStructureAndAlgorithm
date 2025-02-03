/* 
  1
  2 2
  3 3 3
  4 4 4 4
  5 5 5 5 5
 */
#include <iostream>
using namespace std;

int main()
{
  int x;
  cin >> x;
  int count = 0;
  for (int i = 0; i < x;i++){
    for (int j = 0; j < i;j++){
      cout << count << " ";
    }
    cout << "\n";
    count++;
  }
    return 0;
}