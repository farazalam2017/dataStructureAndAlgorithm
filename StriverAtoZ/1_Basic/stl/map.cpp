#include <iostream>
#include <map>
using namespace std;

int main() {
    map<int, string> m;
    m[1] = "One";
    m[2] = "Two";
    for (auto x : m) cout << x.first << " " << x.second << endl;
    return 0;
}
