package designpatterns.builder.carbuilder;

public class Director {

  public void makeSportsCar(CarBuilder builder) {
    builder.setColor("Sporty Red");
    builder.setBrand("Ferrari");
    builder.setFuelType("Gasoline");
    builder.setHorsepower(450);
    builder.setEngine("BMW");
    builder.setGearboxType("Manual");
    builder.setSeats(2);
  }
}
