#include<iostream>
using namespace std;
int main(){
  int a, b;
  cin >> a >> b;
  if(b%a==0 || a%b==0)
    cout << "Multiples" << endl;
  else
    cout << "No Multiples" << endl;
  return 0;
}