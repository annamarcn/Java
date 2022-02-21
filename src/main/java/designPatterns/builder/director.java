package designPatterns.builder;

public class director {

  public void makeSportsCar(carBuilder builder) {
    builder.setColor("Sporty Red");
    builder.setBrand("Ferrari");
    builder.setFuelType("Gasoline");
    builder.setHorsepower(450);
    builder.setEngine("BMW");
    builder.setGearboxType("Manual");
    builder.setSeats(2);
  }
}
