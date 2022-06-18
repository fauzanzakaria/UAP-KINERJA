package Tugas2;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte input = sc.nextByte();

        if (input == 1) {
            Persegi persegi = new Persegi(sc.nextInt());
            persegi.luasPersegi();
        } else if (input == 2) {
            Segitiga segitiga = new Segitiga(sc.nextInt(),sc.nextInt());
            segitiga.luasSegitiga();
        } else if (input == 3) {
            int lingkar = sc.nextInt();
            Lingkaran lingkaran = new Lingkaran(lingkar);
            if (lingkar % 7 == 0) {
                lingkaran.LuasLingkaran1();
            } else {
                lingkaran.LuasLingkaran2();
            }
        } else {
            System.out.println("Input yang anda masukan tidak sesuai");
        }
    }
}
