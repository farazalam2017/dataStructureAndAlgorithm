#include<iostream>
using namespace std;
int main(){
    int a, b, c;
    cin >> a >> b >> c;
    if(a<=b && a<=c){
        cout << a << " ";
        if(b>=c){
            cout << b << endl;
        }else{
            cout << c << endl;
        }
    }else if(b<=a && b<=c){
        cout << b << " ";
        if(a>=c){
            cout << a << endl;
        }else{
            cout << c << endl;
        }
    }else{
        cout << c << " ";
        if(a>=b){
            cout << a << endl;
        }else{
            cout << b << endl;
        }
    }
    return 0;
}