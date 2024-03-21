public class Counter {
    private static Counter instance;
    private int count;

    private Counter() {
        this.count = 0;
    }

    // Static method to get the singleton instance
    public static Counter getInstance() {
        if (instance == null) {
            instance = new Counter();
        }
        return instance;
    }

    // Method to increment the count
    public void increment() {
        count++;
    }

    // Method to get the current count
    public int getCount() {
        return count;
    }
}