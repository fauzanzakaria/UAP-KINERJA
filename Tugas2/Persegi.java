package Tugas2;

class Persegi {
    int sisi;

    public Persegi(int sisi) {
        this.sisi = sisi;
    }
    public int luasPersegi() {
        int luas = sisi*sisi;
        System.out.println(luas);
        return luas;
    }
}