import java.util.ArrayList;

public class NoNullArrayList<T> extends ArrayList<T> {

  public NoNullArrayList() {
    super();
  }

  public NoNullArrayList(int len) {
    super(len);
  }

  public T set(int index, T element) {
    if (element == null) {
      throw new IllegalArgumentException();
    }
    else {
      return super.set(index, element);
    }
  }

  public boolean add(T element) {
    if (element == null) {
      throw new IllegalArgumentException();
    }
    else {
      return super.add(element);
    }
  }

  public void add(int index, T element) {
    if (element == null) {
      throw new IllegalArgumentException();
    }
    else {
      super.add(index, element);
    }
  }


  /*public static void main(String[] args) {
    NoNullArrayList<String> arr = new NoNullArrayList<String>(1);
    arr.add("hello");
    System.out.println(arr.set(0, "hi"));
    System.out.println(arr);
  } */

}
