package designpatterns.builder.carbuilder;

public class CarBuilder extends Builder {
  private int numOfSeats;
  private String brandName;
  private String color;
  private String typeOfEngine;
  private String gearbox;
  private int horsepower;
  private String fuel;

  @Override
  public void setSeats(int numOfSeats) {
    this.numOfSeats = numOfSeats;
  }

  @Override
  public void setBrand(String brandName) {
    this.brandName = brandName;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setEngine(String typeOfEngine) {
    this.typeOfEngine = typeOfEngine;
  }

  public void setGearboxType(String gearbox) {
    this.gearbox = gearbox;
  }

  public void setHorsepower(int horsepower) {
    this.horsepower = horsepower;
  }

  public void setFuelType(String fuel) {
    this.fuel = fuel;
  }

  public Car getResult() {
    return new Car(numOfSeats, brandName, color, typeOfEngine, gearbox, horsepower, fuel);
  }
}
