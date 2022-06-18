package Tugas7;

public class Sales extends Pegawai {
    private int penjualan;
    private double komisi;

    public Sales(String nama, String noKTP, int penjualan, double komisi) {
        super(nama, noKTP);
        this.penjualan = penjualan;
        this.komisi = komisi;
    }

    public int getPenjualan() {
        return penjualan;
    }

    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }

    public double getKomisi() {
        return komisi;
    }

    public void setKomisi(double komisi) {
        this.komisi = komisi;
    }

    @Override
    public double gaji() {
        return (getPenjualan() * getKomisi());
    }

    @Override
    public void tampilData() {
        System.out.print("Sales           : "+super.getNama()+"\n");
        System.out.print("No. KTP         : "+super.getNoKTP()+"\n");
        System.out.print("Total Penjualan : "+this.getPenjualan()+" Pcs"+"\n");
        System.out.print("Besaran Komisi  : Rp "+(int)this.getKomisi()+"\n");
        System.out.println("Pendapatan      : Rp "+(int)gaji()+"\n");
    }
}