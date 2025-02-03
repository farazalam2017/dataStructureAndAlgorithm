/* 
  1
  1 2
  1 2 3 
  1 2 3 4 
  1 2 3 4 5
 */
#include <iostream>
using namespace std;

int main()
{
  int x;
  cin >> x;
  for (int i = 0; i < x;i++){
    for (int j = 0; j < i;j++){
      cout << j + 1;
    }
    cout << "\n";
  }
    return 0;
}