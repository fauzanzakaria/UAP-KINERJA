package Tugas7;

public class PegawaiTetap extends Pegawai {
    private double upah;

    public PegawaiTetap(String nama, String noKTP, double upah) {
        super(nama, noKTP);
        this.upah = upah;
    }

    public double getUpah() {
        return upah;
    }

    public void setUpah(double upah) {
        this.upah = upah;
    }

    @Override
    public double gaji() {
        return this.upah;
    }

    @Override
    public void tampilData() {
        System.out.print("Pegawai Tetap   : "+super.getNama()+"\n");
        System.out.print("No. KTP         : "+super.getNoKTP()+"\n");
        System.out.print("Upah            : Rp "+(int)this.getUpah()+"\n");
        System.out.println("Pendapatan      : Rp "+(int)gaji()+"\n");
    }
}