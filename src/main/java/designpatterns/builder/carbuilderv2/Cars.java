package designpatterns.builder.carbuilderv2;

public class Cars {
  private final int numOfSeats;
  private final String brandName;
  private final String color;
  private final String typeOfEngine;
  private final String gearbox;
  private final int horsepower;
  private final String fuel;

  private Cars(Builder builder) {
    this.numOfSeats = builder.numOfSeats;
    this.brandName = builder.brandName;
    this.color = builder.color;
    this.typeOfEngine = builder.typeOfEngine;
    this.gearbox = builder.gearbox;
    this.horsepower = builder.horsepower;
    this.fuel = builder.fuel;
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

  public static class Builder {

    private int numOfSeats;
    private String brandName;
    private String color;
    private String typeOfEngine;
    private String gearbox;
    private int horsepower;
    private String fuel;

    private Builder() {}

    public static Builder builder() {
      return new Builder();
    }

    public Builder setNumberOfSeats(int numberOfSeats) {
      this.numOfSeats = numberOfSeats;
      return this;
    }

    public Builder setBrandName(String brandName) {
      this.brandName = brandName;
      return this;
    }

    public Builder setColor(String color) {
      this.color = color;
      return this;
    }

    public Builder setTypeOfEngine(String typeOfEngine) {
      this.typeOfEngine = typeOfEngine;
      return this;
    }

    public Builder setGearbox(String gearbox) {
      this.gearbox = gearbox;
      return this;
    }

    public Builder setHorsepower(int horsepower) {
      this.horsepower = horsepower;
      return this;
    }

    public Builder setFuel(String fuel) {
      this.fuel = fuel;
      return this;
    }

    public Cars build() {
      validate();
      return new Cars(this);
    }

    private void validate() {
      if (numOfSeats < 2) {
        throw new IllegalArgumentException("You cannot have a car with less than 2 seats");
      }
    }
  }
}
