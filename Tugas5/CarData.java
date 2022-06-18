package Tugas5;

import java.util.ArrayList;

public class CarData {
    ArrayList <Car> carList = new ArrayList<>();

    public void addCar(String carType, String polNum, String merk) {
        carList.add(new Car(carType, polNum, merk, true));
    }

    public void listOfCar(){
        System.out.println("-".repeat(35));
        System.out.println(" Daftar Mobil");
        System.out.println("-".repeat(35));

        for (Car car : carList) {
            System.out.println("TIPE MOBIL  : " + car.getCarType());
            System.out.println("NO. POLISI  : " + car.getPolNum());
            System.out.println("MERK MOBIL  : " + car.getMerk());
            System.out.println("-".repeat(35));
        }
        System.out.println();
    }
}