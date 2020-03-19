public interface List<E> {
    int size();
    void addFirst(E elem);
    void addLast(E elem);
    void add(E elem, int index);
    void removeFirst();
    void removeLast();
    E get(int index);
}
