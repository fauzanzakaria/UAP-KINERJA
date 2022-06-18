package Tugas6;

public class Manajer extends Pekerja{
    private int lamaKerja;

    Manajer(int jamKerja, int hariKerja, String NIP, String nama, String NIK, boolean jenisKelamin, boolean menikah, int lamaKerja) {
        super(jamKerja, hariKerja, NIP, nama, NIK, jenisKelamin, menikah);
        this.lamaKerja = lamaKerja;
    }

    public int getLamaKerja(){
        return lamaKerja;
    }

    public void setLamaKerja(int lamaKerja){
        this.lamaKerja = lamaKerja;
    }

    public String toString(){
        double bonusLembur = 0;
        double bonusLibur = 0;
        double hasil = 0;
        double gaji = (getJamKerja() * getHariKerja() * 15);
        if(getJamKerja() > 7){
            hasil = getHariKerja() - ((double)(getHariKerja() / 7) * 2);
            bonusLembur = (hasil * (getJamKerja() - 7) * 7);
        }
        bonusLibur = ((((getHariKerja() / 7) * 2) * getJamKerja() * 20));
        double bonus = (bonusLembur + bonusLibur) + ((bonusLibur + bonusLibur) * 0.3);
        double pendapatan = (getPendapatan() + gaji + bonus + 15);

        return ("Nama          : "+super.getNama()+
                "\nNIK           : "+super.getNIK()+
                "\nJenis Kelamin : "+super.getJenisKelamin()+
                "\nPendapatan    : "+pendapatan+"$"+
                "\nBonus         : "+bonus+"$"+
                "\nGaji          : "+gaji+"$"+
                "\nStatus        : "+super.getStatus()+
                "\nLama Kerja    : "+this.getLamaKerja()+" hari"+"\n");
    }
}
