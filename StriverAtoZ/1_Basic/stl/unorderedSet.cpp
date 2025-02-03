#include <iostream>
#include <unordered_set>
using namespace std;

int main() {
    unordered_set<int> us = {1, 3, 2};
    us.insert(4);
    for (auto x : us) cout << x << " ";
    return 0;
}
