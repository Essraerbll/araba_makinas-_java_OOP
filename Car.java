// Soyut sinif: Car
public abstract class Car {
    protected String brand;
    protected String model;
    protected int horsepower;

    public Car(String brand, String model, int horsepower) {
        this.brand = brand;
        this.model = model;
        this.horsepower = horsepower;
    }

    // Soyut metodlar (Her araba tipi kendine ozgu versiyonunu saglayacak)
    public abstract void start();
    public abstract void accelerate();

    // Ortak metod
    public void displayInfo() {
        System.out.println("🚗 Marka: " + brand + ", Model: " + model + ", Beygir Gucu: " + horsepower);
    }
}


