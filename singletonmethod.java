public class singletmethod {
    public static void main(String[] args) {
        Counter obj1 = Counter.getInstance();
        obj1.increment();
        obj1.increment();
        System.out.println("Count from first object= " + obj1.getCount());

        Counter obj2 = Counter.getInstance();
        obj2.increment();
        System.out.println("Count from second object= " + obj2.getCount());

        System.out.println(obj1 == obj2); 
    }
}

