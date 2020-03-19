import java.util.NoSuchElementException;

public class Test {

    private static void testAddFirst() {
        LinkedList<String> l = new LinkedList<String>();
        System.out.println("testAddFirst():");
        System.out.println("before: " + l);
        l.addFirst("charlie");
        System.out.println("one call: " + l);
        l.addFirst("bravo");
        System.out.println("two calls: " + l);
        l.addFirst("alpha");
        System.out.println("three calls: " + l);
        System.out.println();
    }

    private static void testAddLast() {
        LinkedList<String> l = new LinkedList<String>();
        System.out.println("testAddLast():");
        System.out.println("before: " + l);
        l.addLast("alpha");
        System.out.println("one call: " + l);
        l.addLast("bravo");
        System.out.println("two calls: " + l);
        l.addLast("charlie");
        System.out.println("three calls: " + l);
        System.out.println();
    }

    private static void testAdd() {
        LinkedList<String> l = new LinkedList<String>();
        System.out.println("testAdd():");
        System.out.println("before: " + l);
        l.add("alpha", 0);
        System.out.println("l.add(\"alpha\", 0): " + l);
        l.add("charlie",1);
        System.out.println("l.add(\"charlie\",1) " + l);
        l.add("bravo",1);
        System.out.println("l.add(\"bravo\",1): " + l);
        System.out.println();
    }

    private static LinkedList<String> getList() {
        LinkedList<String> l = new LinkedList<String>();
        l.addLast("alpha");
        l.addLast("bravo");
        l.addLast("charlie");
        return l;
    }

    private static void testGet(int index) {
        LinkedList<String> l = getList();
        System.out.println("testGet(" + index + ")");
        System.out.println("before: " + l);
        System.out.println(l.get(index));
        System.out.println("after: " + l);
        System.out.println();
    }

    private static void testGetException() {
        LinkedList<String> l = getList();
        try {
            l.get(3);
            System.out.println("Error, should be throwing an exception");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Success");
        }
        System.out.println();

    }

    private static void testRemoveFirst() {
        LinkedList<String> l = getList();
        System.out.println("testRemoveFirst():");
        System.out.println("before: " + l);
        l.removeFirst();
        System.out.println("after: " + l);
        l.removeFirst();
        System.out.println("after: " + l);
        l.removeFirst();
        System.out.println("after: " + l);
        try {
            l.removeFirst();
            System.out.println("Error, should be throwing an exception");
        } catch (NoSuchElementException e) {
            System.out.println("Success");
        }
        System.out.println();
    }

    private static void testRemoveLast() {
        LinkedList<String> l = getList();
        System.out.println("testRemoveLast():");
        System.out.println("before: " + l);
        l.removeLast();
        System.out.println("after: " + l);
        l.removeLast();
        System.out.println("after: " + l);
        l.removeLast();
        System.out.println("after: " + l);
        try {
            l.removeLast();
            System.out.println("Error, should be throwing an exception");
        } catch (NoSuchElementException e) {
            System.out.println("Success");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        testAddFirst();
        testAddLast();
        testAdd();

        for (int i=0; i<3; i++) {
            testGet(i);
        }
        testGetException();

        testRemoveFirst();
        testRemoveLast();

    }
}
