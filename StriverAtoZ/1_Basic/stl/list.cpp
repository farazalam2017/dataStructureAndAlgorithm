#include <iostream>
#include <list>
using namespace std;

int main() {
    list<int> l = {1, 2, 3};
    l.push_front(0);
    l.push_back(4);

    for (auto x : l) cout << x << " "; // Output: 0 1 2 3 4
    return 0;
}
