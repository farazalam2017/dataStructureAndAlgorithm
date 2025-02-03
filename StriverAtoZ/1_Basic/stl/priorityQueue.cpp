#include <iostream>
#include <queue>
using namespace std;

int main() {
    priority_queue<int> pq; // Max-heap
    pq.push(10);
    pq.push(20);
    cout << pq.top() << endl; // Output: 20
    pq.pop();
    return 0;
}
