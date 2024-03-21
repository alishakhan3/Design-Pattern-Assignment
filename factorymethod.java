interface Pizza {
    void bake();
    void ready();
}

class CheesePizza implements Pizza {

    @Override
    public void bake() {
        System.out.println("Baking Cheese Pizza");
    }

    @Override
    public void ready() {
        System.out.println("Cheese Pizza Ready");
    }
}

// Concrete implementation of a Pepperoni Pizza
class PaneerPizza implements Pizza {

    @Override
    public void bake() {
        System.out.println("\nBaking Paneer Pizza");
    }

    @Override
    public void ready() {
        System.out.println("Paneer Pizza Ready");
    }
}

class PizzaFactory {
    public static Pizza createPizza(String pizza) {
        if (pizza.equalsIgnoreCase("cheese")) {
            return new CheesePizza();
        } else if (pizza.equalsIgnoreCase("paneer")) {
            return new PaneerPizza();
        } else {
            throw new IllegalArgumentException("Invalid");
        }
    }
}

public class factorymethod {
    public static void main(String[] args) {
        Pizza cheesePizza = PizzaFactory.createPizza("cheese");
        cheesePizza.bake();
        cheesePizza.ready();

        Pizza paneerPizza = PizzaFactory.createPizza("paneer");
        paneerPizza.bake();
        paneerPizza.ready();
    }
}
