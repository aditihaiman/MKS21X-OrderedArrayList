public class Driver {
  public static void main(String[] args) {
    NoNullArrayList<Integer> list = new NoNullArrayList<Integer>(5);
    list.add(0, 8);
    list.add(5);
    System.out.println(list);
    try {
      System.out.println(list.add(null));
    }
    catch (IllegalArgumentException e) {
      System.out.println(e);
    }
    System.out.println(list.add(7));
    System.out.println(list);
  }
}
