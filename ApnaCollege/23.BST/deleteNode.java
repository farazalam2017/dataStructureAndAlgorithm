
public class deleteNode {
  static class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
      this.data = data;
    }
  }

  public static Node insert(Node root, int value) {
    if (root == null) {
      root = new Node(value);
      return root;
    }
    if (root.data > value) {
      //left subtree
      root.left = insert(root.left, value);//return pointer to left subtree
    } else {
      //right subtree
      root.right = insert(root.right, value);
    }
    return root;
  }

  public static void inorder(Node root) {
    if (root == null) {
      return;
    }
    inorder(root.left);
    System.out.print(root.data + " ");
    inorder(root.right);
  }

  public static boolean search(Node root, int key) {
    if (root == null) {
      return false;
    }
    if (root.data == key) {
      return true;
    }
    if (root.data > key) {
      return search(root.left, key);
    } else {
      return search(root.right, key);
    }
  }

  public static Node delete(Node root, int value) {
    if (root.data < value) {
      root.right = delete(root.right, value);
    } else if (root.data > value) {
      root.left = delete(root.left, value);
    } else {
      //case 1- lead Node
      if (root.left == null && root.right == null)
        return null;

      //case 2- single child
      if (root.left == null) {
        return root.right;
      } else if (root.right == null) {
        return root.left;
      }
      //case 3- both children
      Node IS = findInorderSuccessor(root.right);
      root.data = IS.data;
      root.right = delete(root.right, IS.data);
    }
    return root;
  }

  public static Node findInorderSuccessor(Node root) {
    while (root.left != null) {
      root = root.left;
    }
    return root;
  }
  public static void main(String[] args) {
    int values[] = { 8,5,3,1,4,6,10,11,14 };
    Node root = null;
    for (int i = 0; i < values.length; i++) {
      root = insert(root, values[i]);
    }
    inorder(root);
    System.out.println();
    root = delete(root, 14);
    System.out.println();
    inorder(root);
  }
}

