import java.util.ArrayList;

public class NoNullArrayList<T> extends ArrayList<T> {
  private int size;
  private int length;

  public NoNullArrayList() {
    size = 0;
    length = 10;
  }

  public NoNullArrayList(int len) {
    size = 0;
    length = len;
  }

  public void set(int index, T element) {
    if (element)
  }

}
