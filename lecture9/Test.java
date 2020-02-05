interface DummyInterface {
}

class DummySuperclass implements DummyInterface {
}

public class Test extends DummySuperclass {

    public static void main(String[] args) {

        Test test = new Test();

        if (test instanceof DummyInterface)
            System.out.println("test is an instance of DummyInterface.");
            
        if (test instanceof DummySuperclass)
            System.out.println("test is an instance of DummySuperclass.");
    }
}

