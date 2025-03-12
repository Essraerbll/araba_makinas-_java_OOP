public class CarFactory {
    public static Car createCar(String type, String brand, String model, int horsepower) {
        switch (type.toLowerCase()) {
            case "sedan":
                return new Sedan(brand, model, horsepower);
            case "suv":
                return new SUV(brand, model, horsepower);
            case "electric":
                return new ElectricCar(brand, model, horsepower);
            default:
                throw new IllegalArgumentException("Gecersiz araba tipi: " + type);
        }
    }
}
