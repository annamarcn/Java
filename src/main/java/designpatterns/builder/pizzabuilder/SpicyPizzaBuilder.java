package designpatterns.builder.pizzabuilder;

/* "ConcreteBuilder" */
public class SpicyPizzaBuilder extends PizzaBuilder {
  public void buildDough() {
    pizza.setDough("pan baked");
  }

  public void buildSauce() {
    pizza.setSauce("hot");
  }

  public void buildTopping() {
    pizza.setTopping("pepperoni+salami");
  }
}