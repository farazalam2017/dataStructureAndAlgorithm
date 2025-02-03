#include <iostream>
#include <utility>
using namespace std;

int main() {
    pair<int, string> p = {1, "Hello"};
    cout << p.first << " " << p.second << endl; // Output: 1 Hello
    return 0;
}
