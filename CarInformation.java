package Array;

public class CarInformation {
    String ownerName;
    String brand;
    int year;

    CarInformation(String ownerName, String brand, int year) {
        this.ownerName = ownerName;
        this.brand = brand;
        this.year = year;
    }

    public static void main(String[] args) {
        CarInformation[] car = new CarInformation[3];
        car[0] = new CarInformation("lalit", "BMW", 2021);
        car[1] = new CarInformation("Bhushan", "Honda", 2021);
        car[2] = new CarInformation("Kiran", "Suzuki", 2021);

        for (int i = car.length - 1; i >= 0; i--) {
            System.out.println("Students name: " + car[i].ownerName + " age: " + car[i].year);
        }
    }
}
