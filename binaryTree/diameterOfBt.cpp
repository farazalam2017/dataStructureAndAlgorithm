/* statement:Given the root of binary tree, return the length of diameter, Diameter of a binary tree is the longest distance between any two nodes of that tree. This path may or may not pass through tree. */
/* ----------------------------------------- */
/* ----------------------------------------- */
/* Created By:-  Visual Studio Code
Author:- Faraz Alam
Email:- farazalam2017@gmail.com
GitHub Repo:- https://github.com/farazalam2017/dataStructureAndAlgorithm
Date: 2025-02-22 09:40:15
Title: diameterOfBt.cpp */
/* ------------------------------------------ */
/* ------------------------------------------ */
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
int height(Node *node, int &diameter)
{
  if (!node)
  {
    return 0;
  }
  int leftHeight = height(node->left, diameter);
  int rightHeight = height(node->right, diameter);
  diameter = max(diameter, leftHeight + rightHeight);
  return (1 + max(leftHeight, rightHeight));
}
int diameterOfBT(Node *root)
{
  int diameter = 0;
  height(root, diameter);
  return diameter;
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
  int diameter = diameterOfBT(root);
  cout << "The diameter of the binary tree is: " << diameter << endl;
}