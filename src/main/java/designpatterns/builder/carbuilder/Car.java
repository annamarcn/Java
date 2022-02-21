package designpatterns.builder.carbuilder;

public class Car {

  private final int numOfSeats; // why does it have to be "final"?
  private final String brandName;
  private final String color;
  private final String typeOfEngine;
  private final String gearbox;
  private final int horsepower;
  private final String fuel;

  public Car(
      int numOfSeats,
      String brandName,
      String color,
      String typeOfEngine,
      String gearbox,
      int horsepower,
      String fuel) {
    this.numOfSeats = numOfSeats;
    this.brandName = brandName;
    this.color = color;
    this.typeOfEngine = typeOfEngine;
    this.gearbox = gearbox;
    this.horsepower = horsepower;
    this.fuel = fuel;
  }

  public int getNumOfSeats() {
    return numOfSeats;
  }

  public String getBrandName() {
    return brandName;
  }

  public String getColor() {
    return color;
  }

  public String getTypeOfEngine() {
    return typeOfEngine;
  }

  public String getGearbox() {
    return gearbox;
  }

  public int getHorsepower() {
    return horsepower;
  }

  public String getFuel() {
    return fuel;
  }
}
