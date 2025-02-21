/* statement:- Given a Binary Tree, return true if it is a Balanced Binary Tree else return false. A Binary Tree is balanced if, for all nodes in the tree, the difference between left and right subtree height is not more than 1. */
/* --------------------------------------------- */
/* --------------------------------------------- */
/* balanced binary Tree;- (height(left) - height(right) <=1) */
/* ----------------------------------------------- */
/* ----------------------------------------------- */
/* Created By:-  Visual Studio Code
Author:- Faraz Alam
Email:- farazalam2017@gmail.com
GitHub Repo:- https://github.com/farazalam2017/dataStructureAndAlgorithm
Date: 2025-02-21 11:03:33
Title: checkForBalancedBT.cpp */
#include <iostream>
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

// Function declaration before use
int height(Node *root);

bool isBalanced(Node *root)
{
  if (root == NULL)
  {
    return true;
  }
  if (height(root) == -1)
  {
    return false;
  }
  return true;
}

int height(Node *root)
{
  if (root == NULL)
  {
    return 0;
  }

  int leftHeight = height(root->left);
  int rightHeight = height(root->right);

  if (leftHeight == -1 || rightHeight == -1 || abs(leftHeight - rightHeight) > 1)
  {
    return -1;
  }

  return 1 + max(leftHeight, rightHeight);
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

  if (isBalanced(root))
  {
    cout << "Tree is balanced";
  }
  else
  {
    cout << "Tree is not balanced";
  }
}
