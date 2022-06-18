package Tugas7;

public class PegawaiHarian extends Pegawai {
    private double upahPerJam;
    private int totalJam;

    public PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJam) {
        super(nama, noKTP);
        this.upahPerJam = upahPerJam;
        this.totalJam = totalJam;
    }

    public double getUpahPerJam() {
        return upahPerJam;
    }

    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }

    public int getTotalJam() {
        return totalJam;
    }

    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }

    @Override
    public double gaji() {
        double gaji=0;
        if (this.totalJam <= 40){
            return (getUpahPerJam() * getTotalJam());
        }else {
            return (40 * (getUpahPerJam()) + (getTotalJam() - 40) * (getUpahPerJam() * 1.5));
        }
    }

    @Override
    public void tampilData() {
        System.out.print("Pegawai Harian  : "+super.getNama()+"\n");
        System.out.print("No. KTP         : "+super.getNoKTP()+"\n");
        System.out.print("Upah/jam        : Rp "+(int)this.getUpahPerJam()+"\n");
        System.out.print("Total jam kerja : "+this.getTotalJam()+" Jam"+"\n");
        System.out.println("Pendapatan      : Rp "+(int)gaji()+"\n");
    }
}