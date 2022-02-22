package designpatterns.builder.carbuilder;

public class CarBuilder implements Builder {
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

  @Override
  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public void setEngine(String typeOfEngine) {
    this.typeOfEngine = typeOfEngine;
  }

  @Override
  public void setGearboxType(String gearbox) {
    this.gearbox = gearbox;
  }

  @Override
  public void setHorsepower(int horsepower) {
    this.horsepower = horsepower;
  }

  @Override
  public void setFuelType(String fuel) {
    this.fuel = fuel;
  }

  public Car buildCar() {
    return new Car(numOfSeats, brandName, color, typeOfEngine, gearbox, horsepower, fuel);
  }
}
