package designPatterns.builder;

public abstract class builder {

  public abstract void setSeats(int numOfSeats);

  public abstract void setBrand(String brandName);

  public abstract void setColor(String color);

  public abstract void setEngine(String typeOfEngine);

  public abstract void setGearboxType(String gearbox);

  public abstract void setHorsepower(int horsepower);

  public abstract void setFuelType(String fuel);
}
