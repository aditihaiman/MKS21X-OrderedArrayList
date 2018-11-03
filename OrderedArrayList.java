public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  public OrderedArrayList() {
    super();
  }

  public OrderedArrayList(int len) {
    super(len);
  }

  public boolean add(T element) {
    if (element == null) throw new IllegalArgumentException();
    int idx = 0;
    for (int x = 0; x < this.size(); x++) {
      if (this.get(x).compareTo(element) > 0) {
        idx = x;
        break;
      }
    }
    super.add(idx, element);
    return true;
  }

  public void add(int index, T element) {
    this.add(element);
  }

  public T set(int index, T element) {
    if (element == null) throw new IllegalArgumentException();
    T output = this.get(index);
    super.remove(index);
    this.add(element);
    return output;
  }
}
