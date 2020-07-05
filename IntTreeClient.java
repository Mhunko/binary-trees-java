public class IntTreeClient {
   public static void main(String[] args){
      IntTree t = new IntTree(12);
      
      System.out.println("Tree structure:");
      t.printSideways();
      System.out.println();
      t.printPreorder();
      System.out.println();
      t.printInorder();
      System.out.println();
      t.printPostorder();
      
      //
      System.out.println();
      System.out.println(t.sum());
      System.out.println(t.countLeaves());
      System.out.println(t.countLevels());
   }
}