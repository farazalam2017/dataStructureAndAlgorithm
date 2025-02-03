import java.util.LinkedList;
import java.util.Queue;
public class traversal {
  static class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }
  // build tree
  static class BinaryTree {
    static int index = -1;

    public Node buildTree(int nodes[]) {
      index++;
      if (nodes[index] == -1) {
        return null;
      }
      Node newNode = new Node(nodes[index]);
      newNode.left = buildTree(nodes);
      newNode.right = buildTree(nodes);
      return newNode;
    }
    //preOrder Traversal
    public void preOrder(Node root) {
      if (root == null) {
        // System.out.print("-1 ");// use this line to get original nodes[] array
        return;
      }
      System.out.print(root.data + " ");
      preOrder(root.left);
      preOrder(root.right);
    }
    //onorder traversal
    public void inorder(Node root) {
      if (root == null) {
        return;
      }
      inorder(root.left);
      System.out.print(root.data + " ");
      inorder(root.right);
    }
    //postorder traversal
    public void postOrder(Node root) {
      if (root == null) {
        return;
      }
      postOrder(root.left);
      postOrder(root.right);
      System.out.print(root.data + " ");
    }
    //level order traversal
    public void levelOrder(Node root){
      if(root==null){
        return;
      }
      Queue<Node> q = new LinkedList<>();
      q.add(root);
      q.add(null);/* for next line */
      while (!q.isEmpty()) {
        Node currentNode = q.remove();
        if (currentNode == null) {
          System.out.println();
          if (q.isEmpty()) {
            break;
          } else {
            q.add(null);
          }
        } else {
          System.out.print(currentNode.data + " ");
          if (currentNode.left != null) {
            q.add(currentNode.left);
          }
          if (currentNode.right != null) {
            q.add(currentNode.right);
          }
        }
      }

    } 
  }
  public static void main(String args[]) {
    int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
    BinaryTree tree = new BinaryTree();
    Node root = tree.buildTree(nodes);
    System.out.println("PreOrder traversal is:- ");
    tree.preOrder(root);
    System.out.println();
    System.out.println("Inorder traversal is:- ");
    tree.inorder(root);
    System.out.println();
    System.out.println("PostOrder traversal is:- ");
    tree.postOrder(root);
    System.out.println();
    System.out.println("Level Order traversal is:- ");
    tree.levelOrder(root);
    // System.out.print(root.data);

  }
}
