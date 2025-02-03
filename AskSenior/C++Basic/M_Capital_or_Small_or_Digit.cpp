#include<iostream>
using namespace std;
int main(){
  char ch;
  cin >> ch;
  int num = (int)ch;
  if(num>=48 && num<=57){
    cout << "IS DIGIT" << endl;
  }else{
    cout << "ALPHA" << endl;
    if(num>=65 && num<=90){
      cout << "IS CAPITAL" << endl;
    }else{
      cout << "IS SMALL" << endl;
    }
  }
  return 0;
}