package edu.iu.habahram.pizzashop.model;

public class NewYorkPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item) {
        PizzaFactory pizzaFactory = (PizzaFactory) new NewYorkPizzaFactory();
        return pizzaFactory.createPizza(item);
    }
}
