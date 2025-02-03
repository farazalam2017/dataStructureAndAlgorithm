#include <iostream>
#include <set>
using namespace std;

int main() {
    set<int> s = {10, 20, 30};
    s.insert(15);
    for (auto x : s) cout << x << " "; // Output: 10 15 20 30
    return 0;
}
