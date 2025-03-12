public class Sedan extends Car {
    public Sedan(String brand, String model, int horsepower) {
        super(brand, model, horsepower);
    }

    @Override
    public void start() {
        System.out.println(brand + " " + model + " calistirildi. Sessiz ve konforlu!");
    }

    @Override
    public void accelerate() {
        System.out.println(brand + " " + model + " hizlaniyor. Sehir icinde mukemmel!");
    }
}
