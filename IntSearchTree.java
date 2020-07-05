public class IntSearchTree {

//1066
   private IntTreeNode overallRoot;
   
   public IntSearchTree() {
      overallRoot = null;
   }
   
   public void add(int value) {
      overallRoot = add(overallRoot, value);
   }
   
   private IntTreeNode add(IntTreeNode root, int value) {
      if (root == null) {
         root = new IntTreeNode(value);
      } else if (value <= root.data){
         root.left = add(root.left, value);
      } else {
         root.right = add(root.right, value);
      }
      return root;
   }
   public boolean contains(int value) {
      return contains(overallRoot, value);
   }  
   
   private boolean contains(IntTreeNode root, int value) {
      if (root == null) {
         return false;
      } else if (value == root.data) {
         return true;
      } else if (value < root.data) {
         return contains(root.left, value);
      } else {//value > root.data
         return contains(root.right, value);
      }
   }
   
   
   public void print() {
      printInorder(overallRoot);
      System.out.println();
   }
   private void printInorder(IntTreeNode theRoot) {
      if (theRoot != null) {
         printInorder(theRoot.left);
         System.out.print(" " + theRoot.data);
         printInorder(theRoot.right);
      }
   }
   
   
   public void printSideways() {
      printSideways(overallRoot, 0);
   }
   private void printSideways(IntTreeNode root, int level) {
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