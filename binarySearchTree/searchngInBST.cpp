/* Given a binary search tree and a key value return the node in the BST having data equal to key otherwise return nullptr */
/* ------------------------------------ */
/* ------------------------------------ */
/* Created By:-  Visual Studio Code
Author:- Faraz Alam
Email:- farazalam2017@gmail.com
GitHub Repo:- https://github.com/farazalam2017/dataStructureAndAlgorithm
Date: 2025-02-23 11:56:46
Title: searchngInBST.cpp */
/* ------------------------------------- */
/* ------------------------------------- */
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
void printInorder(Node *root)
{
  if (root == nullptr)
  {
    return;
  }
  printInorder(root->left);
  cout << root->data << " ";
  printInorder(root->right);
}
Node *searchBST(Node *root, int value)
{
  while (root != NULL && root->data != value)
  {
    if (value < root->data)
    {
      root = root->left;
    }
    else
    {
      root = root->right;
    }
    return root;
  }
}
int main()
{
  Node *root = new Node(5);
  root->left = new Node(3);
  root->right = new Node(8);
  root->left->left = new Node(2);
  root->left->right = new Node(4);
  root->right->left = new Node(6);
  root->right->right = new Node(10);
  cout << "Binary Search Tree: " << endl;
  printInorder(root);
  cout << endl;
  int key = 6;
  Node *result = searchBST(root, key);
  if (result != NULL)
  {
    cout << "value " << key << " found in BST" << "\n";
  }
  else
  {
    cout << "value " << key << "not found in BST" << "\n";
  }
}