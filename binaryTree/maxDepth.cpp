/* statement:- Constrcut a binary tree and find its max depth/height */
/* -------------------------------------- */
/* -------------------------------------- */
/* Created By:-  Visual Studio Code
Author:- Faraz Alam
Email:- farazalam2017@gmail.com
GitHub Repo:- https://github.com/farazalam2017/dataStructureAndAlgorithm
Date: 2025-02-21 10:33:52
Title: maxDepth.cpp */
/* -------------------------------------- */
/* -------------------------------------- */
#include <iostream>
#include <vector>
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
int maxDepth(Node *root)
{
  if (root == NULL)
  {
    return 0;
  }
  int leftHeight = maxDepth(root->left);
  int rightHeight = maxDepth(root->right);
  return (1 + max(leftHeight, rightHeight));
}
int main()
{
  Node *root = new Node(1);
  root->left = new Node(2);
  root->right = new Node(3);
  root->left->left = new Node(4);
  root->left->right = new Node(5);
  root->left->right->right = new Node(6);
  root->left->right->right->right = new Node(7);
  int depth = maxDepth(root);
  cout << "Maximum depth of the binary tree: " << depth << endl;
  return 0;
}