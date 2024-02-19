package edu.iu.habahram.pizzashop.model;

public class NewYorkPizzaStore {
    protected Pizza createPizza(String item) {
        PizzaFactory pizzaFactory = (PizzaFactory) new NewYorkPizzaFactory();
        return pizzaFactory.createPizza(item);
    }
}
