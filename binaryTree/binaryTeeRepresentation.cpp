/* statement:- Construct a binary tree and perform traversal technique like preorder, inorder and postorder traversal */
/* -------------------------------------- */
/* -------------------------------------- */
/* Created By:-  Visual Studio Code
Author:- Faraz Alam
Email:- farazalam2017@gmail.com
GitHub Repo:- https://github.com/farazalam2017/dataStructureAndAlgorithm
Date: 2025-02-21 09:23:34
Title: binaryTeeRepresentation.cpp */
/* ------------------------------------------- */
/* ------------------------------------------- */
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

void preOrder(Node *root, vector<int> &arr)
{
  if (root == NULL)
  {
    return;
  }
  arr.push_back(root->data);
  preOrder(root->left, arr);
  preOrder(root->right, arr);
}
vector<int> preOrder(Node *root)
{
  vector<int> arr;
  preOrder(root, arr);
  return arr;
}
void inOrder(Node *root, vector<int> &arr)
{
  if (root == NULL)
  {
    return;
  }
  inOrder(root->left, arr);
  arr.push_back(root->data);
  inOrder(root->right, arr);
}
vector<int> inOrder(Node *root)
{
  vector<int> arr;
  inOrder(root, arr);
  return arr;
}
void postOrder(Node *root, vector<int> &arr)
{
  if (root == NULL)
  {
    return;
  }
  postOrder(root->left, arr);
  postOrder(root->right, arr);
  arr.push_back(root->data);
}
vector<int> postOrder(Node *root)
{
  vector<int> arr;
  postOrder(root, arr);
  return arr;
}
int main()
{
  Node *root = new Node(1);
  root->left = new Node(2);
  root->right = new Node(3);
  root->left->left = new Node(4);
  root->left->right = new Node(5);
  root->left->right->left = new Node(8);
  root->right->left = new Node(6);
  root->right->right = new Node(7);
  root->right->right->left = new Node(9);
  root->right->right->right = new Node(10);
  vector<int> result = preOrder(root);
  cout << "Pre order traveral" << "\n";
  for (int value : result)
  {
    cout << value << " ";
  }
  cout << "\n";
  vector<int> result1 = inOrder(root);
  cout << "Inorder traveral" << "\n";
  for (int value : result1)
  {
    cout << value << " ";
  }
  cout << "\n";
  vector<int> result2 = inOrder(root);
  cout << "PostOrder traveral" << "\n";
  for (int value : result2)
  {
    cout << value << " ";
  }
  cout << "\n";
}