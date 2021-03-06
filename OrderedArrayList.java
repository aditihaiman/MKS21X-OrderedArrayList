public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  public OrderedArrayList() {
    super();
  }

  public OrderedArrayList(int len) {
    super(len);
  }

  public boolean add(T element) {
    if (element == null) throw new IllegalArgumentException();
    for (int x = 0; x < this.size(); x++) {
      if (this.get(x).compareTo(element) > 0) {
        super.add(x, element);
        return true;
      }
    }
    return super.add(element);
  }

  public void add(int index, T element) {
    if (index < 0 || index > this.size()) {
       throw new IndexOutOfBoundsException();
    }
    this.add(element);
  }

  public T set(int index, T element) {
    if (element == null) throw new IllegalArgumentException();
    if (index < 0 || index >= this.size()) {
      throw new IndexOutOfBoundsException();
    }
    T output = this.get(index);
    super.remove(index);
    this.add(element);
    return output;
  }
}
