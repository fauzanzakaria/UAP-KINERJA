package Tugas5;

import java.util.ArrayList;

public class RentArchive {
    ArrayList <CarRent> rentData = new ArrayList<>();

    public void Rent(CarRider rider,Car car,int rentDur) {
        if (car.isStatus()) {
            rentData.add(new CarRent(rider, car, rentDur));
            System.out.println("MOBIL BERHASIL DISEWA");
            car.setStatus(false);

        } else {
            System.out.println("MAAF, MOBIL SUDAH DISEWA");
        }
    }

    public void info(){
        System.out.println("-".repeat(35));
        System.out.println(" Informasi Pelanggan");
        System.out.println("-".repeat(35));

        for (CarRent rentDatum : rentData) {
            System.out.println("NAMA PEMINJAM   : " + rentDatum.getRider().getName());
            System.out.println("TIPE MOBIL      : " + rentDatum.getCar().getCarType());
            System.out.println("Merk MOBIL      : " + rentDatum.getCar().getMerk());
            System.out.println("NO. POLISI      : " + rentDatum.getCar().getPolNum());
            System.out.println("LAMA RENTAL     : " + rentDatum.getRentDur());
            System.out.println("-".repeat(35));
        }
    }
}