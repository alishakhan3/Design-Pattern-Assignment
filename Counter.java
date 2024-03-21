public class Counter {
    private static Counter instance;
    private int count;

    private Counter() {
        this.count = 0;
    }

    public static Counter getInstance() {
        if (instance == null) {
            instance = new Counter();
        }
        return instance;
    }

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}