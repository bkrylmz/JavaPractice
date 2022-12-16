package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObject {
    public static void main(String[] args) {

       Car1 car1 =  new Car1();
       car1.setInfo("Toyota","Camry", "White", 2021, 35000 );

       System.out.println(car1);

       Car1 car2 = new Car1();
       car2.setInfo("BMW", "335is", "Black", 2020, 45000);

       System.out.println(car2);

       Car1 car3 = new Car1();
       car3.setInfo("Audi", "Q7","Red", 2019, 40000);

        System.out.println(car3);

       // Car[] cars = {car1, car2, car3};

        ArrayList<Car1> carsList = new ArrayList<>();
        carsList.addAll(Arrays.asList(car1, car2, car3));

        for (Car1 each : carsList) {
            System.out.println(each.brand+" : "+ each.price);
        }

        System.out.println("---------------------------------------------------");

        carsList.removeIf(p-> p.brand.equals("BMW") && p.year >= 2005 && p.year<= 2008);
        carsList.removeIf(p-> p.brand.equals("Toyota")&& p.year >= 1995 && p.year<= 1997);











    }
}
