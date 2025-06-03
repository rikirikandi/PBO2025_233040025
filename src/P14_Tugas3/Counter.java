package P14_Tugas3;

public class Counter {
    private static int instanceCount = 0;

    public Counter() {
        instanceCount++;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }
}

