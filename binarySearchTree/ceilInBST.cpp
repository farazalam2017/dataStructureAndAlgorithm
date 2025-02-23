/* statement:- Given a BST return the ceiling of the given key in BST */
/* ---------------------------------------------- */
/* ---------------------------------------------- */
/* Created By:-  Visual Studio Code
Author:- Faraz Alam
Email:- farazalam2017@gmail.com
GitHub Repo:- https://github.com/farazalam2017/dataStructureAndAlgorithm
Date: 2025-02-23 12:32:15
Title: ceilInBST.cpp */
/* ----------------------------------------------- */
/* ----------------------------------------------- */
#include <iostream>
#include <vector>
using namespace std;
struct Node
{
  int data;
  Node *left;
  Node *right;
  Node(int data)
  {
    this->data = data;
    left = right = NULL;
  }
};
void printInOrder(Node *root)
{
  if (root == NULL)
  {
    return;
  }
  printInOrder(root->left);
  cout << root->data << " ";
  printInOrder(root->right);
}
int ceileing(Node *root, int key)
{
  int ceil = -1;
  while (root)
  {
    if (root->data == key)
    {
      ceil = root->data;
      return ceil;
    }
    if (key > root->data)
    {
      root = root->right;
    }
    else
    {
      ceil = root->data;
      root = root->left;
    }
  }
  return ceil;
}
int main()
{
  Node *root = new Node(10);
  root->left = new Node(5);
  root->right = new Node(13);
  root->left->left = new Node(3);
  root->left->left->left = new Node(2);
  root->left->left->right = new Node(4);
  root->left->right = new Node(6);
  root->left->right->right = new Node(9);
  root->right->left = new Node(11);
  root->right->right = new Node(14);

  cout << "Binary Search Tree: " << endl;
  printInOrder(root);
  cout << endl;
  int target = 8;
  int ceil = ceileing(root, target);
  if (ceil != -1)
  {
    cout << "Ceiling of " << target << " is: " << ceil << endl;
  }
  else
  {
    cout << "No ceiling found!";
  }
}