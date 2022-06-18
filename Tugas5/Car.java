package Tugas5;

public class Car {
    private String carType;
    private String polNum;
    private String merk;
    private Boolean status;

    public Car(String carType, String polNum, String merk, Boolean status){
        this.carType = carType;
        this.polNum = polNum;
        this.merk = merk;
        this.status = status;
    }

    public String getCarType() {
        return carType;
    }
    public String getPolNum() {
        return polNum;
    }
    public String getMerk() {
        return merk;
    }
    public Boolean isStatus() {
        return status;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }
}