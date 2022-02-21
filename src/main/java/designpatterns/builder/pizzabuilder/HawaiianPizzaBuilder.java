package designpatterns.builder.pizzabuilder;

/* "ConcreteBuilder" */
public class HawaiianPizzaBuilder extends PizzaBuilder {
  public void buildDough() {
    pizza.setDough("sour");
  }

  public void buildSauce() {
    pizza.setSauce("mild");
  }

  public void buildTopping() {
    pizza.setTopping("ham+pineapple");
  }
}
