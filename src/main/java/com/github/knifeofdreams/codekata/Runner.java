package com.github.knifeofdreams.codekata;

import designpatterns.builder.carbuilder.Car;
import designpatterns.builder.carbuilder.CarBuilder;
import designpatterns.builder.carbuilder.Director;
import designpatterns.builder.pizzabuilder.HawaiianPizzaBuilder;
import designpatterns.builder.pizzabuilder.Pizza;
import designpatterns.builder.pizzabuilder.PizzaBuilder;
import designpatterns.builder.pizzabuilder.Waiter;

public class Runner {

  public static void main(String[] args) {
    Waiter waiter = new Waiter();
    PizzaBuilder hawaiianPizzabuilder = new HawaiianPizzaBuilder();

    waiter.setPizzaBuilder( hawaiianPizzabuilder );
    waiter.constructPizza();

    Pizza builtPizza = waiter.getPizza();

    Pizza manualPizza = new Pizza();
    manualPizza.setDough("sour");
    manualPizza.setSauce("mild");
    manualPizza.setTopping("ham+pineapple");

    System.out.println(builtPizza);

    Director director = new Director();
    CarBuilder sportsCar = new CarBuilder();
    Car car = director.makeSportsCar(sportsCar);
    System.out.println(car);
  }
}
