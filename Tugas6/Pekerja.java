package Tugas6;

public class Pekerja extends Manusia{
    private double gaji;
    private double bonus;
    private int jamKerja;
    private int hariKerja;
    private String NIP;

    Pekerja(int jamKerja, int hariKerja, String NIP, String Nama,  String NIK, Boolean JenisKelamin, Boolean Menikah){
        super(Nama, NIK, JenisKelamin, Menikah);
        this.NIP = NIP;
        this.hariKerja = hariKerja;
        this.jamKerja = jamKerja;
    }

    void setGaji(double Gaji){
        this.gaji = Gaji;
    }

    public double getGaji() {
        gaji = this.getHariKerja() * this.getJamKerja() * 15;
        return gaji;
    }

    void setJamKerja(int jamKerja){
        this.jamKerja = jamKerja;
    }
    int getJamKerja(){
        return jamKerja;
    }

    void setHariKerja(int hariKerja){
        this.hariKerja = hariKerja;
    }
    int getHariKerja(){
        return hariKerja;
    }

    void setNIP(String NIP){
        this.NIP = NIP;
    }
    String getNIP(){
        return NIP;
    }

    String getStatus(){
        String kantorCabang = "";
        String Departemen = "";
        switch(getNIP().charAt(0)){
            case ('1'):
                kantorCabang = "Mondstadt";
                break;
            case ('2'):
                kantorCabang = "Liyue";
                break;
            case ('3'):
                kantorCabang = "Inazuma";
                break;
            case ('4'):
                kantorCabang = "Sumeru";
                break;
            case ('5'):
                kantorCabang = "Fontaine";
                break;
            case ('6'):
                kantorCabang = "Natlan";
                break;
            case ('7'):
                kantorCabang = "Snezhnaya";
                break;
        }
        switch(getNIP().charAt(6)){
            case ('1'):
                Departemen = "Pemasaran";
                break;
            case ('2'):
                Departemen = "Humas";
                break;
            case ('3'):
                Departemen = "Riset";
                break;
            case ('4'):
                Departemen = "Teknologi";
                break;
            case ('5'):
                Departemen = "Personalia";
                break;
            case ('6'):
                Departemen = "Akademik";
                break;
            case ('7'):
                Departemen = "Administrasi";
                break;
            case ('8'):
                Departemen = "Operasional";
                break;
            case ('9'):
                Departemen = "Pembangunan";
                break;
        }
        char status;
        status = getNIP().charAt(2);

        return (Departemen+", "+kantorCabang+" cabang ke-"+status);
    }

    public String toString(){
        double bonusLembur = 0;
        double bonusLibur = 0;
        gaji = (getJamKerja() * getHariKerja() * 15);
        bonusLibur = ((((getHariKerja() / 7) * 2) * getJamKerja() * 20));
        if(getJamKerja() > 7){
            double hasil = ((getHariKerja() / 7) * 2) - getHariKerja();
            bonusLembur = ((7 - getJamKerja()) * 7);
        }
        bonus = bonusLembur + bonusLibur;
        double pendapatan = (getPendapatan() + gaji + bonus);

        return "Nama          : "+super.getNama()+
                "\nNIK           : "+super.getNIK()+
                "\nNIP           : "+getNIP()+
                "\nJenis Kelamin : "+super.getJenisKelamin()+
                "\nPendapatan    : "+pendapatan+"$"+
                "\nBonus         : "+bonus+"$"+
                "\nGaji          : "+gaji+"$"+
                "\nStatus        : "+this.getStatus()+"\n";
    }
}