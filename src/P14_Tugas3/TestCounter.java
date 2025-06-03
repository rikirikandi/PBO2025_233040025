package P14_Tugas3;

public class TestCounter {
    public static void main(String[] args) {
        new Counter();
        new Counter();
        new Counter();

        System.out.println("Total objects created: " + Counter.getInstanceCount());
    }
}
