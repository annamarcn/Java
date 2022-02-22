package designpatterns.builder.carbuilder;

public interface Builder {

  void setSeats(int numOfSeats);

  void setBrand(String brandName);

  void setColor(String color);

  void setEngine(String typeOfEngine);

  void setGearboxType(String gearbox);

  void setHorsepower(int horsepower);

  void setFuelType(String fuel);
}
