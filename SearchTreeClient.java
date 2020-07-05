import java.util.*;

public class SearchTreeClient {
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      
      SearchTree<String> names = new SearchTree<>();
      System.out.print("Next String (blank to quit)?");
      
      String name = console.nextLine();
      while (name.length() > 0) {
         names.add(name);
         System.out.print("Next String (blank to quit)?");
         name = console.nextLine();
      }
      System.out.println();
      
      System.out.println("Tree structure:");
      names.printSideways();
      System.out.println("Sorted list");
      names.print();
      
      SearchTree<Integer> numbers = new SearchTree<>();
      System.out.print("Next Int (0 to quit)?");
      
      int number = console.nextInt();
      while (number != 0) {
         numbers.add(number);
         System.out.print("Next Int (0 to quit)?");
         number = console.nextInt();
      }
      System.out.println();
      
      System.out.println("Tree structure:");
      numbers.printSideways();
      System.out.println("Sorted list");
      numbers.print();
   
   }
   
   
}