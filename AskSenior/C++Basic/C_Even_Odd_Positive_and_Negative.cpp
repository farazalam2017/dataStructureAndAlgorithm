#include<iostream>
using namespace std;
int main(){
  int a, b;
  cin >> a;
  int even = 0, odd = 0, positive = 0, negative = 0;
  for (int i = 0; i < a;i++){
    cin >> b;
    if(b>0){
      positive++;
    }else if(b<0){
      negative++;
    }
    if (b%2==0){
      even++;
    }else{
      odd++;
    }
  }
  cout << "Even: " << even << endl;
  cout << "Odd: " << odd << endl;
  cout << "Positive: " << positive << endl;
  cout << "Negative: " << negative << endl;
  return 0;
}