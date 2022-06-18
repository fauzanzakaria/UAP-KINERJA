package Tugas6;

public class MahasiswaFilkom extends Manusia {
    private String NIM;
    private double IPK;

    MahasiswaFilkom(String nama, String NIK, boolean jenisKelamin, boolean menikah, String NIM, Double IPK) {
        super(nama, NIK, jenisKelamin, menikah);
        this.NIM = NIM;
        this.IPK = IPK;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public double getIPK() {
        return IPK;
    }

    public void setIPK(double IPK) {
        this.IPK = IPK;
    }

    public String getStatus() {
        String Prodi = "";
        String Angkatan = "";
        if(getNIM().startsWith("20")){
            Angkatan = "2020";
        }else if(NIM.startsWith("21")){
            Angkatan = "2021";
        }else if(getNIM().startsWith("22")){
            Angkatan = "2022";
        }

        switch(getNIM().charAt(6)){
            case ('2'):
                Prodi = "Teknik Meniup Gelembung";
                break;
            case ('3'):
                Prodi = "Teknik Berburu Ubur Ubur";
                break;
            case ('4'):
                Prodi = "Sistem Perhamburgeran";
                break;
            case ('6'):
                Prodi = "Pendidikan Chum Bucket";
                break;
            case ('7'):
                Prodi = "Teknologi Telepon Kerang";
                break;
        }
        return (Prodi+", "+Angkatan);

    }

    public double getBeasiswa() {
        double beasiswa = 0;
        if (getIPK() >= 3.0 && getIPK() <= 3.5) {
            beasiswa = 50;
        } else if (getIPK() > 3.5 && getIPK() <= 4) {
            beasiswa = 75;
        }

        return beasiswa;
    }

    @Override
    public String toString() {
        return "Nama          : " + super.getNama()+
                "\nNIK           : " + super.getNIK()+
                "\nJenis Kelamin : " + super.getJenisKelamin()+
                "\nPendapatan    : " + (super.getPendapatan()+this.getBeasiswa())+"$"+
                "\nIPK           : " + this.getIPK()+
                "\nNIM           : " + this.getNIM()+
                "\nStatus        : " + this.getStatus() +"\n";
    }
}
