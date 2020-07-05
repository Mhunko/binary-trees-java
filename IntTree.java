public class IntTree {

   private IntTreeNode root;
   //private IntTreeNode root;
   
   
   public IntTree() {
      root = new IntTreeNode(12, null, null);
      root.left = new IntTreeNode(18);
      root.right = new IntTreeNode(7);
      root.left.left = new IntTreeNode(23);
      root.right.left = new IntTreeNode(4);
      root.right.right = new IntTreeNode(13);
   }
   
   public IntTree(int max) {
      root = buildTree(1, max);
   }
   
   private IntTreeNode buildTree(int n, int max) {
      if (n>max) {
         return null;
      } else {
         IntTreeNode left = buildTree(2 * n, max);
         IntTreeNode right = buildTree(2 * n + 1, max);
         
         return new IntTreeNode(n, left, right);
      }
   }
   
   
   // preorder
   public void printPreorder() {
      printPreorder(this.root);
   }
   
   // recursive method responsible for printing
   private void printPreorder(IntTreeNode theRoot) {
      if (theRoot != null) {
         System.out.print(" " + theRoot.data);
         printPreorder(theRoot.left);
         printPreorder(theRoot.right);
      }
   }
   
   // inorder
   public void printInorder() {
      printInorder(this.root);
   }
   
   
   private void printInorder(IntTreeNode theRoot) {
      if (theRoot != null) {
         printInorder(theRoot.left);
         System.out.print(" " + theRoot.data);
         printInorder(theRoot.right);
      }
   }
   //postorder
   public void printPostorder() {
      printPostorder(this.root);
   }
   
   
   private void printPostorder(IntTreeNode theRoot) {
      if (theRoot != null) {
         printPostorder(theRoot.left);
         printPostorder(theRoot.right);
         System.out.print(" " + theRoot.data);
      }
   }
   
   
   public void printSideways() {
      printSideways(root, 0);
   }
   
   private void printSideways(IntTreeNode root, int level) {
      if (root != null) {
         printSideways(root.right, level+1);
         for (int i = 0; i < level; i++) {
            System.out.print("    ");
         }
         System.out.println(root.data);
         printSideways(root.left, level + 1);
      }
   }

   public int sum() {
      return sum(root);
   }
   
   private int sum(IntTreeNode root) {
      if (root == null) {
         return 0;
      } else {
         return root.data + sum(root.left) + sum(root.right);
      }
   }  
   
   public int countLevels() {
      return countLevels(root);
   }
   
   private int countLevels(IntTreeNode root) {
      if (root == null) {
         return 0;
      } else {
         return 1 + Math.max(countLevels(root.left), countLevels(root.right));
      }
   }  
   
   public int countLeaves() {
      return countLeaves(root);
   }
   
   private int countLeaves(IntTreeNode root) {
      if (root == null) {
         return 0;
      } else if (root.left == null && root.right == null) {
         return 1;
      } else {
         return countLeaves(root.left) + countLeaves(root.right);
      }
   }

}