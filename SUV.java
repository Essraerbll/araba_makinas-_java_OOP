public class SUV extends Car {
    public SUV(String brand, String model, int horsepower) {
        super(brand, model, horsepower);
    }

    @Override
    public void start() {
        System.out.println(brand + " " + model + " calistirildi. Guclu ve saglam!");
    }

    @Override
    public void accelerate() {
        System.out.println(brand + " " + model + " hizlaniyor. Arazi icin ideal!");
    }
}
