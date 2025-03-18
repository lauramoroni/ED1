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
      }

      while (current != null) {
         parent = current;
         if (key < current.key) {
            if (current.left == null) {
               current.left = newNode;
               newNode.parent = parent;
            }
         } else if (key > current.key) {
            if (current.right == null) {
               current.right = newNode;
               newNode.parent = parent;
            }
         }
      }
   }

   public int remove(int key) {
      Node nodeRemoved = search(key);

      if (nodeRemoved == null) {
         return -1;
      } else {
         if (nodeRemoved == this.root) {
            this.root = null;
         } else {
            Node parent = nodeRemoved.parent;
            if (nodeRemoved.left == null && nodeRemoved.right == null) {
               if (parent.left == nodeRemoved) {
                  parent.left = null;
               } else {
                  parent.right = null;
               }
            } else if (nodeRemoved.left != null && nodeRemoved.right == null) {
               if (parent.left == nodeRemoved) {
                  parent.left = nodeRemoved.left;
               } else {
                  parent.right = nodeRemoved.left;
               }
            } else if (nodeRemoved.left == null && nodeRemoved.right != null) {
               if (parent.left == nodeRemoved) {
                  parent.left = nodeRemoved.right;
               } else {
                  parent.right = nodeRemoved.right;
               }
            } else {
               Node successor = nodeRemoved.right;
               while (successor.left != null) {
                  successor = successor.left;
               }

               nodeRemoved.key = successor.key;
               if (successor.parent.left == successor) {
                  successor.parent.left = null;
               } else {
                  successor.parent.right = null;
               }
            }
         }
      }

      this.size--;
      return key;
   }
}
