/* statement:- Construct a binary tree and return if the two trees are identical or not */
/* ------------------------------------------------- */
/* ------------------------------------------------- */
/* Created By:-  Visual Studio Code
Author:- Faraz Alam
Email:- farazalam2017@gmail.com
GitHub Repo:- https://github.com/farazalam2017/dataStructureAndAlgorithm
Date: 2025-02-23 11:03:44
Title: IdenticalTree.cpp */
/* --------------------------------------------------- */
/* --------------------------------------------------- */
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
bool isIdentical(Node *node1, Node *node2)
{
  if (node1 == NULL && node2 == NULL)
  {
    return true;
  }
  if (node1 == NULL || node2 == NULL)
  {
    return false;
  }
  return ((node1->data == node2->data) && isIdentical(node1->left, node2->left) && isIdentical(node1->right, node2->right));
}

int main()
{
  // Node 1
  Node *root1 = new Node(1);
  root1->left = new Node(2);
  root1->right = new Node(3);
  root1->left->left = new Node(4);
  // Node 2
  Node *root2 = new Node(1);
  root2->left = new Node(2);
  root2->right = new Node(3);
  root2->left->left = new Node(4);
  if (isIdentical(root1, root2))
  {
    cout << "The binary trees are identical." << endl;
  }
  else
  {
    cout << "The binary trees are not identical." << endl;
  }
}