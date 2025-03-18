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

   public int getSize() {
      return this.size;
   }

   public boolean isEmpty() {
      return this.root == null;
   }

   public Node search(int key) {
      Node current = this.root;
      
      while (current != null) {
         if (key < current.key) {
            current = current.left;
         } else {
            current = current.right;
         }
      }

      return current;
   }
}
