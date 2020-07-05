public class SearchTree<E extends Comparable<E>> {

   private SearchTreeNode<E> overallRoot;
   
   public SearchTree() {
      overallRoot = null;
   }
   

   private int compare(E value1, E value2){
      if (value1.compareTo(value2) > 0){
         return 1;
      } else if (value1.compareTo(value2) < 0){
         return -1;
      } else {
         return 0;
      }
   }
   public void add(E value) {
      overallRoot = add(overallRoot, value);
   }
   
   private SearchTreeNode<E> add(SearchTreeNode<E> root, E value) {
      if (root == null) {
         root = new SearchTreeNode<E>(value);
      } else if (compare(value, root.data) == -1){
         root.left = add(root.left, value);
      } else {
         root.right = add(root.right, value);
      }
      return root;
   }
   public boolean contains(E value) {
      return contains(overallRoot, value);
   }  
   
   private boolean contains(SearchTreeNode<E> root, E value) {
      if (root == null) {
         return false;
      } else if (value == root.data) {
         return true;
      } else if (compare(value, root.data) == -1) {
         return contains(root.left, value);
      } else {//value > root.data
         return contains(root.right, value);
      }
   }
   
   
   public void print() {
      printInorder(overallRoot);
      System.out.println();
   }
   private void printInorder(SearchTreeNode<E> theRoot) {
      if (theRoot != null) {
         printInorder(theRoot.left);
         System.out.print(" " + theRoot.data);
         printInorder(theRoot.right);
      }
   }
   
   
   public void printSideways() {
      printSideways(overallRoot, 0);
   }
   private void printSideways(SearchTreeNode<E> root, int level) {
      if (root != null) {
         printSideways(root.right, level + 1);
         for (int i = 0; i < level; i++) {
            System.out.print("    ");
         }
         System.out.println(root.data);
         printSideways(root.left, level + 1);
      }
   }
}