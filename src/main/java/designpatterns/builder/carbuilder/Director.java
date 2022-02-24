package designpatterns.builder.carbuilder;

public class Director {

  public Car makeSportsCar(CarBuilder builder) {
    builder.setColor("Sporty Red");
    builder.setBrand("Ferrari");
    builder.setFuelType("Gasoline");
    builder.setHorsepower(450);
    builder.setEngine("BMW");
    builder.setGearboxType("Manual");
    builder.setSeats(2);
    return builder.buildCar();
  }

  public Car makeTruck(CarBuilder builder) {
    builder.setColor("White");
    builder.setBrand("Volvo");
    builder.setFuelType("Gasoline");
    builder.setHorsepower(770);
    builder.setEngine("BMW");
    builder.setGearboxType("Automatic");
    builder.setSeats(2);
    return builder.buildCar();
  }

  public Car makeFamilyCar(CarBuilder builder) {
    builder.setColor("Magenta");
    builder.setBrand("Volkswagen");
    builder.setFuelType("95");
    builder.setHorsepower(190);
    builder.setEngine("Volkswagen");
    builder.setGearboxType("Automatic");
    builder.setSeats(5);
    return builder.buildCar();
  }
}
