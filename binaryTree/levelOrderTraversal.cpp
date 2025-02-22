/* statement:- Construct a binary tree and perform level order tarversal on it. */
/* ----------------------------------------- */
/* ----------------------------------------- */
/* Created By:-  Visual Studio Code
Author:- Faraz Alam
Email:- farazalam2017@gmail.com
GitHub Repo:- https://github.com/farazalam2017/dataStructureAndAlgorithm
Date: 2025-02-22 12:17:29
Title: levelOrderTraversal.cpp */
/* ------------------------------------------- */
/* ------------------------------------------- */
#include <iostream>
#include <vector>
#include <queue>
using namespace std;
struct Node
{
  int data;
  Node *left;
  Node *right;
  Node(int value)
  {
    data = value;
    left = right = NULL;
  }
};
vector<vector<int>> levelOrder(Node *root)
{
  vector<vector<int>> result;
  if (!root)
  {
    return result;
  }
  queue<Node *> q;
  q.push(root);
  while (!q.empty())
  {
    int size = q.size();
    vector<int> level;
    for (int i = 0; i < size; i++)
    {
      Node *node = q.front();
      q.pop();
      level.push_back(node->data);
      if (node->left)
        q.push(node->left);
      if (node->right)
      {
        q.push(node->right);
      }
    }
    result.push_back(level);
  }
  return result;
}
void printVector(const vector<int> &vec)
{
  // Iterate through the
  // vector and print each element
  for (int num : vec)
  {
    cout << num << " ";
  }
  cout << endl;
}
int main()
{
  Node *root = new Node(1);
  root->left = new Node(2);
  root->right = new Node(3);
  root->left->left = new Node(4);
  root->left->right = new Node(5);
  vector<vector<int>> result = levelOrder(root);
  cout << "Level Order Traversal of Tree: " << endl;

  // Printing the level order traversal result
  for (const vector<int> &level : result)
  {
    printVector(level);
  }

  return 0;
}