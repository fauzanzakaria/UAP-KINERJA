package Tugas8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Selamat Datang di game Defend FILKOM !");
        System.out.print("Silahkan masukkan nama player : ");
        String nama = scan.nextLine();
        int role = 0;
        int count = 0;
        boolean start;

        while (true) {
            start = true;
            System.out.println("""
                    Silahkan pilih karakter yang Anda inginkan :\s
                    1. Magician
                    2. Healer
                    3. Warrior""");
            try {
                String roles = scan.nextLine();
                role = Integer.parseInt(roles);
            } catch (Exception e) {
                start = false;
            }
            if (start && role > 0 && role < 4) {
                break;
            } else if (!start) {
                System.err.println("Tolong masukkan angka !");
            } else {
                System.err.println("Tolong pilih angka dari 1-3 !");
            }
        }
        Titan titan = new Titan();
        Character characterr = null;
        System.out.printf("Selamat datang, %s !%n", nama);

        switch (role) {
            case 1 -> {
                characterr = new Magician();
                characterr.info();
            }
            case 2 -> {
                characterr = new Healer();
                characterr.info();
            }
            case 3 -> {
                characterr = new Warrior();
                characterr.info();
            }
            default -> {
            }
        }
        while (titan.getHp() > 0 && characterr.getHp() > 0) {
            count++;
            System.out.printf("============ TURN %d ============%n", count);
            System.out.println("Enemy's HP\t: " + titan.getHp());
            System.out.printf("%s's HP\t: %d%n", nama, characterr.getHp());
            if (count %2 == 0 && characterr instanceof Healer) {
                ((Healer) characterr).heal();
            }
            if (titan.attack()) {
                characterr.receiveDamage(titan.getAttack());
            }
            if (characterr.attack()) {
                titan.receiveDamage(characterr.getAttack());
            }
        }
        if (titan.getHp() == 0) {
            titan.setHp(0);
        }
        else if (characterr.getHp() == 0) {
            characterr.setHp(0);
        }
        System.out.println("==============================");
        String hasil = titan.getHp() == 0 ? nama : "Titan";
        System.out.println(hasil + " menang\n");
        System.out.println("=========== PLAYER ===========");
        characterr.info();
        System.out.println("\n=========== MUSUH  ===========");
        titan.info();
    }
}