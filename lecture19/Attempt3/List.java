public interface List<E> {
    void addFirst(E elem);
    void addLast(E elem);
    void add(E elem, int pos);
    E get(int index);
    E removeFirst();
    E removeLast();
}
