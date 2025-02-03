#include <iostream>
#include <vector>
using namespace std;

int main() {
    vector<int> v(5, 10); // {10, 10, 10, 10, 10}
    v.emplace_back(20);  // Adds 20
    v.insert(v.begin(), 5); // Inserts 5 at the beginning
    v.erase(v.begin()); // Removes the first element

    for (auto x : v) cout << x << " "; // Output: 10 10 10 10 20
    return 0;
}
