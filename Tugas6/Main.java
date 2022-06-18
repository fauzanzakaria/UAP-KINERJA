package Tugas6;

public class Main {
    static Manusia manusia[] ;
    static MahasiswaFilkom mahasiswa[];
    static Pekerja pekerja[];
    static Manajer manajer[];

    public static void main(String []args){
        System.out.println("Nama : Fauzan Zakaria Hermansah");
        System.out.println("NIM  : 215150700111023");
        manusia = new Manusia[3];
        System.out.println("                   Data Manusia                  ");
        System.out.println("=".repeat(50));
        manusia[0] = new Manusia("Aku", "3923842934",true, true);
        System.out.println(manusia[0].toString());
        manusia[1] = new Manusia("Kamu", "3923842935",false, true);
        System.out.println(manusia[1].toString());
        manusia[2] = new Manusia("Dia", "3923842936",true, false);
        System.out.println(manusia[2].toString());

        mahasiswa = new MahasiswaFilkom[3];
        System.out.println("               Data MahasiswaFilkom              ");
        System.out.println("=".repeat(50));
        mahasiswa[0] = new MahasiswaFilkom("I Putu Yoga", "351923848239", false,false,"205150601111018",3.70);
        System.out.println(mahasiswa[0].toString());
        mahasiswa[1] = new MahasiswaFilkom("Fauzan Zakaria", "351923848239", true,true,"215150301111019",4.00);
        System.out.println(mahasiswa[1].toString());
        mahasiswa[2] = new MahasiswaFilkom("Nadya Putri", "351923848239", false,true,"225150401111017",3.90);
        System.out.println(mahasiswa[2].toString());

        pekerja = new Pekerja[3];
        System.out.println("                   Data Pekerja                  ");
        System.out.println("=".repeat(50));
        pekerja[0] = new Pekerja(7, 22, "195102439283","Iqbal Biondy","351717969",true,true);
        System.out.println(pekerja[0].toString());
        pekerja[1] = new Pekerja(9, 24, "596102339284","Zakia Tiara","551717968",false,true);
        System.out.println(pekerja[1].toString());
        pekerja[2] = new Pekerja(11, 26, "797102139285","Arif Setiawan","751717967",true,false);
        System.out.println(pekerja[2].toString());

        manajer = new Manajer[3];
        System.out.println("                   Data Manajer                  ");
        System.out.println("=".repeat(50));
        manajer[0] = new Manajer(9, 20, "204837583728", "Wardah Wardani","3517073843920",false,false,1500);
        System.out.println(manajer[0].toString());
        manajer[1] = new Manajer(11, 22,"405837283729", "Rafika Brian","3517073843921",true,false,1600);
        System.out.println(manajer[1].toString());
        manajer[2] = new Manajer(13, 24,"306837683727", "Lisa Aurel","3517073843922",false,true,1700);
        System.out.println(manajer[2].toString());

        System.out.println("         Total Keseluruhan yang Terdaftar        ");
        System.out.println("=".repeat(50));
        System.out.println("Jumlah Manusia   : " + manusia.length);
        System.out.println("Jumlah Mahasiswa : " + mahasiswa.length);
        System.out.println("Jumlah Pekerja   : " + pekerja.length);
        System.out.println("Jumlah Manager   : " + manajer.length);
    }
}