package Tugas3;

class Baju {
    String jenis;
    int harga, jumlah;

    public Baju(String jenis, int jumlah) {
        this.jenis = jenis;
        this.jumlah = jumlah;
    }

    final int bajuA = 100000;
    final int bajuB = 125000;
    final int bajuC = 175000;

    void hargaA() {
        if (jumlah > 100) {
            harga = 95000;
        } else {
            harga = bajuA;
        }
    }
    void hargaB (){
        if (jumlah>100) {
            harga = 120000;
        }else {
            harga = bajuB;
        }
    }
    void hargaC (){
        if (jumlah>100){
            harga = 160000;
        }else{
            harga = bajuC;
        }
    }
    void display(){
        if(jenis.equalsIgnoreCase("a"))
            hargaA();
        else if (jenis.equalsIgnoreCase("b"))
            hargaB();
        else if (jenis.equalsIgnoreCase("c"))
            hargaC();
        System.out.println("Jenis yang anda beli    : "+jenis);
        System.out.println("Harga per buah          : "+harga);
        System.out.println("Total harga             : "+harga*jumlah);
    }
}