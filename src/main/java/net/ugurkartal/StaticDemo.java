package net.ugurkartal;

public class StaticDemo {
    public static int totalCount = 0;
    public int instanceCount = 0;

    @Override
    public String toString() {
        return "StaticDemo{" +
                "totalCount = " + totalCount + " " +
                "instanceCount = " + instanceCount +
                '}';
    }

    public static void incrementTotalCount() {
        totalCount++;
    }

    public void incrementInstanceCount() {
        instanceCount++;
    }
}
