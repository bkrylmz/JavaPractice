package day38_IsARelationVsHasARelation.CarTask;

public class ParkingLot {
    public static void main(String[] args) {


    Toyota toyata = new Toyota("Camry", 2020, 20.000, "Gray", 123456);

    Tesla tesla = new Tesla("Model S", 2022, 94990, "Red", 0);

    BMW bmw = new BMW("X5", 2020, 67350, "Black", 12000);


    toyata.start();
    tesla.start();
    bmw.start();


}
}