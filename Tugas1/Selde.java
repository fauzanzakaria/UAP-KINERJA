package Tugas1;

import java.util.Scanner;

public class Selde {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int angka = sc.nextInt();
        isPalindrom(angka);
    }
    public static boolean isPalindrom(int angka){
        int palindrom = angka;
        if (palindrom == reverse(angka)){
            System.out.println(angka + " adalah selde.");
        }else {
            System.out.println(angka + " bukan selde.");
        }
        return true;
    }
    public static int reverse(int angka){
        int hasil = 0, remainder;
        while (angka > 0){
            remainder = angka % 10;
            hasil = hasil * 10 + remainder;
            angka = angka / 10;
        }
        return hasil;
    }
}
