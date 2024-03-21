public class singletmethod {
    public static void main(String[] args) {
        Counter counter1 = Counter.getInstance();
        counter1.increment();
        counter1.increment();
        System.out.println("Count from counter1: " + counter1.getCount());

        Counter counter2 = Counter.getInstance();
        counter2.increment();
        System.out.println("Count from counter2: " + counter2.getCount());

        // Both counter1 and counter2 point to the same instance
        System.out.println(counter1 == counter2); // Output: true
    }
}

