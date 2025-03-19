public class BinaryTree {
   // classe que representa cada nó na árvore binária
   class Node {
      int key;
      Node left, right, parent;

      Node(int key) {
         this.key = key;
         left = null;
         right = null;
         parent = null;
      }
   }

   // atributos da árvore
   private Node root;
   private int size;

   public BinaryTree() {
      this.root = null;
      this.size = 0;
   }

   public BinaryTree(int key) {
      this.root = new Node(key);
      this.size = 1;
   }

   public int getSize() {
      return this.size;
   }

   public boolean isEmpty() {
      return this.root == null;
   }

   public Node search(int key) {
      Node current = this.root;
      
      while (current != null && current.key != key) {
         if (key < current.key) {
            current = current.left;
         } else if ( key > current.key) {
            current = current.right;
         }
      }

      return current;
   }

   public void insert(int key) {
      Node newNode = new Node(key);
      Node current = this.root;
      Node parent = null;

      this.size++;

      if (isEmpty()) {
         this.root = newNode;
         return;
      }

      while (current != null) {
         parent = current;
         if (key < current.key) {
            if (current.left == null) {
               current.left = newNode;
               newNode.parent = parent;
               return;
            }
            current = current.left;
         } else if (key > current.key) {
            if (current.right == null) {
               current.right = newNode;
               newNode.parent = parent;
               return;
            }
            current = current.right;
         }
      }
   }

   public void printInOrder() {
      printInOrder(this.root);
      System.out.println();
   }

   public void printInOrder(Node node) {
      if (node != null) {
         printInOrder(node.left);
         System.out.print(node.key + " ");
         printInOrder(node.right);
      } else {
         return;
      }

   }

}
