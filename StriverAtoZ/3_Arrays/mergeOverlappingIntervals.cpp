#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

vector<vector<int>> mergeOverlappingIntervals(vector<vector<int>> &arr) {
    int n = arr.size();
    sort(arr.begin(), arr.end()); // Sort intervals by their starting times
    vector<vector<int>> ans;      // Use a 2D vector to store intervals
    for (int i = 0; i < n; i++) {
        // If ans is empty or current interval doesn't overlap with the last interval in ans
        if (ans.empty() || arr[i][0] > ans.back()[1]) {
            ans.push_back(arr[i]); // Add the current interval
        } else {
            // Merge the current interval with the last interval in ans
            ans.back()[1] = max(ans.back()[1], arr[i][1]);
        }
    }
    return ans;
}

int main() {
    vector<vector<int>> arr = {{1, 3}, {8, 10}, {2, 6}, {15, 18}};
    vector<vector<int>> ans = mergeOverlappingIntervals(arr);
    cout << "The merged intervals are: " << "\n";
    for (auto it : ans) {
        cout << "[" << it[0] << ", " << it[1] << "] ";
    }
    cout << endl;
    return 0;
}
  