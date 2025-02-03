#include <iostream>
#include <stack>
using namespace std;

int main() {
    stack<int> s;
    s.push(10);
    s.push(20);
    cout << s.top() << endl; // Output: 20
    s.pop();
    cout << s.top() << endl; // Output: 10
    return 0;
}
