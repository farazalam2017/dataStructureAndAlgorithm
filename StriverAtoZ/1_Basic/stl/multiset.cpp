#include <iostream>
#include <set>
using namespace std;

int main() {
    multiset<int> ms = {10, 10, 20};
    ms.insert(20);
    for (auto x : ms) cout << x << " "; // Output: 10 10 20 20
    return 0;
}
