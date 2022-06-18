package Tugas5;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nama : Fauzan Zakaria Hermansah");
        System.out.println("NIM  : 215150700111023");
        CarRider Fauzan = new CarRider ("Fauzan Zakaria", 19, "08000000000");
        CarRider Rayhan = new CarRider ("Rayhan Bachtiar", 20, "081111111111");
        CarRider Herlangga = new CarRider ("Herlangga Fitdia", 31, "081222222222");
        CarRider Rafika = new CarRider ("Rafika Brian", 25, "081333333333");

        CarData data = new CarData();
        data.addCar ("SUV", "N 544 EG", "Honda CR-V");
        data.addCar ("SPORT", "N 241 OG", "Chevrolet Camaro ZL1");
        data.addCar ("VAN", "N 777 GD", "Suzuki APV");
        data.addCar ("MPV", "N 591 TS", "Mitsubishi Xpander");

        data.listOfCar();

        RentArchive arsip = new RentArchive();
        arsip.Rent (Fauzan, data.carList.get(1), 9);
        arsip.Rent (Rayhan, data.carList.get(0), 3);
        arsip.Rent (Herlangga, data.carList.get(1), 1);
        arsip.Rent (Rafika, data.carList.get(3), 6);

        System.out.println();
        arsip.info();
    }
}