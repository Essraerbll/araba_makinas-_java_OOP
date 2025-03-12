import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Car> carList = new ArrayList<>();

        System.out.println("🚗 Araba Fabrikasina Hosgeldiniz! 🚗");

        while (true) {
            System.out.println("\n1️⃣ Araba Uret");
            System.out.println("2️⃣ Uretilen Arabalari Goster");
            System.out.println("3️⃣ Arabalari Calistir ve Hizlandir");
            System.out.println("4️⃣ Cikis");
            System.out.print("Seciminizi yapin: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Boslugu tuket

            switch (choice) {
                case 1:
                    System.out.print("Araba Tipi (Sedan, SUV, Electric): ");
                    String type = scanner.nextLine();

                    System.out.print("Marka: ");
                    String brand = scanner.nextLine();

                    System.out.print("Model: ");
                    String model = scanner.nextLine();

                    System.out.print("Beygir Gucu: ");
                    int horsepower = scanner.nextInt();
                    scanner.nextLine();

                    try {
                        Car newCar = CarFactory.createCar(type, brand, model, horsepower);
                        carList.add(newCar);
                        System.out.println("✅ " + brand + " " + model + " basariyla uretildi!");
                    } catch (IllegalArgumentException e) {
                        System.out.println("❌ Hata: " + e.getMessage());
                    }
                    break;

                case 2:
                    System.out.println("\n🚘 Uretilen Arabalar:");
                    for (Car car : carList) {
                        car.displayInfo();
                    }
                    break;

                case 3:
                    System.out.println("\n🚀 Arabalar Calistiriliyor ve Hizlaniyor:");
                    for (Car car : carList) {
                        car.start();
                        car.accelerate();
                    }
                    break;

                case 4:
                    System.out.println("🚗 Araba Fabrikasi kapatiliyor... Gule gule!");
                    scanner.close();
                    return;

                default:
                    System.out.println("❌ Gecersiz secim! Tekrar deneyin.");
            }
        }
    }
}
