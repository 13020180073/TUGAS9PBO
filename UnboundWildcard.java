

public class UnboundWildcard {
    public static void printAll(List<?> list) {
      for (Object item : list)
         System.out.println(item + " ");
   }

   public static void main(String args[]) {
      List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
      printAll(integerList);
   }
}

