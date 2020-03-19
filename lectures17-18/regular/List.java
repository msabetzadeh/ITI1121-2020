public interface List<E> {

    E get(int pos);
    int size();
    void add(E element, int pos);
    void remove(int pos);
    boolean remove(E element);

}
