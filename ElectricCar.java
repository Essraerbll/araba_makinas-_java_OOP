public class ElectricCar extends Car {
    public ElectricCar(String brand, String model, int horsepower) {
        super(brand, model, horsepower);
    }

    @Override
    public void start() {
        System.out.println(brand + " " + model + " elektrikle calistirildi. Cevre dostu!");
    }

    @Override
    public void accelerate() {
        System.out.println(brand + " " + model + " hizlaniyor. Aninda tork!");
    }
}
