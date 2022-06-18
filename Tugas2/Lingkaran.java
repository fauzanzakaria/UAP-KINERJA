package Tugas2;

class Lingkaran {
    int r;

    public Lingkaran(int r){
        this.r = r;
    }
    public int LuasLingkaran1(){
        int luas = (int) (22/7*r*r);
        System.out.println((double) luas);
        return luas;
    }
    public int LuasLingkaran2(){
        int luas = (int) (3.14*r*r);
        System.out.println((double) luas);
        return luas;
    }
}
