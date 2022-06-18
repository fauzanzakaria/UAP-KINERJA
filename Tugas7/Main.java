package Tugas7;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nama    : Fauzan Zakaria Hermansah");
        System.out.println("NIM     : 215150700111023");
        System.out.println("                Data Pegawai Tetap                ");
        System.out.println("=".repeat(50));
        Pegawai tetap1 = new PegawaiTetap("Rafika Brian", "3171071708450001", 2000000);
        tetap1.tampilData();
        Pegawai tetap2 = new PegawaiTetap("Saiful Bachroni", "3272072708450002", 4000000);
        tetap2.tampilData();
        Pegawai tetap3 = new PegawaiTetap("Lisa Aurel", "3373073708450003", 6000000);
        tetap3.tampilData();

        System.out.println("                Data Pegawai Harian               ");
        System.out.println("=".repeat(50));
        Pegawai harian1 = new PegawaiHarian("Rangga Fitdia", "3112072710900001", 8500, 40);
        harian1.tampilData();
        Pegawai harian2 = new PegawaiHarian("Hariz Maulana", "3222072720900002", 8000, 45);
        harian2.tampilData();
        Pegawai harian3 = new PegawaiHarian("Zulfa Asrori", "3332072730900003", 10000, 25);
        harian3.tampilData();

        System.out.println("                    Data Sales                    ");
        System.out.println("=".repeat(50));
        Pegawai sales1 = new Sales("Hadyan Febrian", "3671081708920004", 50, 50000);
        sales1.tampilData();
        Pegawai sales2 = new Sales("Almeikisha Abdan", "3672082708920005", 85, 120000);
        sales2.tampilData();
        Pegawai sales3 = new Sales("Kayla Zafir", "3673083708920006", 70, 100000);
        sales3.tampilData();
    }
}