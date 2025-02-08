/* statement:- Given an array and a sum k, we need to print the length of the longest subarray that sums to k (array contains only positive) */
/* -------------------------------------- */
/* -------------------------------------- */
/* example:- N=3, k=5, arr[]= {2,3,5}, ans=2(length) */
/* -------------------------------------- */
/* Created By:-  Visual Studio Code
Author:- Faraz Alam
Email:- farazalam2017@gmail.com
GitHub Repo:- https://github.com/farazalam2017/dataStructureAndAlgorithm
Date: 2025-02-08 12:09:29
Title: longestSubArrayWithSumK.cpp */
/* --------------------------------------- */
/* --------------------------------------- */
#include <iostream>
#include <vector>
using namespace std;
int getLongestSubarray(vector<int> &arr, int k)
{
    int n = arr.size();
    int left = 0;
    int right = 0;
    int sum = arr[0];
    int maxLen = 0;
    while (right < n)
    {
        // 3.if (sum>k), reduce the array from left until sum become less or equal to k
        while (left <= right && sum > k)
        {
            sum = sum - arr[left];
            left++;
        }
        // 2. if (sum==k), update the maxLength
        if (sum == k)
        {
            maxLen = max(maxLen, right - left + 1);
        }
        // 1.move the right pointer forward
        right++;
        if (right < n)
            sum += arr[right];
    }
    return maxLen;
}
int main()
{
    vector<int> a = {2, 3, 5, 1, 9};
    int k = 10;
    int len = getLongestSubarray(a, k);
    cout << "Length of longest subarray is:- " << len << "\n";
}

/*
#include <iostream>
#include <vector>
using namespace std;

pair<int, vector<int>> getLongestSubarray(vector<int> &arr, int k)
{
    int n = arr.size();
    int left = 0, right = 0;
    int sum = arr[0];
    int maxLen = 0, startIdx = -1, endIdx = -1;

    while (right < n)
    {
        while (left <= right && sum > k)
        {
            sum -= arr[left];
            left++;
        }

        if (sum == k)
        {
            if (right - left + 1 > maxLen)
            {
                maxLen = right - left + 1;
                startIdx = left;
                endIdx = right;
            }
        }

        right++;
        if (right < n)
            sum += arr[right];
    }

    vector<int> subarray;
    if (startIdx != -1 && endIdx != -1)
    {
        for (int i = startIdx; i <= endIdx; i++)
        {
            subarray.push_back(arr[i]);
        }
    }

    return {maxLen, subarray};
}

int main()
{
    vector<int> a = {2, 3, 5, 1, 9};
    int k = 10;
    auto result = getLongestSubarray(a, k);

    cout << "Length of longest subarray is: " << result.first << "\n";
    if (!result.second.empty())
    {
        cout << "Subarray: ";
        for (int num : result.second)
        {
            cout << num << " ";
        }
        cout << "\n";
    }
    else
    {
        cout << "No subarray found with sum " << k << "\n";
    }
}


*/