#include <iostream>
#include <map>
using namespace std;

int main() {
    multimap<int, string> mm;
    mm.insert({1, "One"});
    mm.insert({1, "First"});
    for (auto x : mm) cout << x.first << " " << x.second << endl;
    return 0;
}
