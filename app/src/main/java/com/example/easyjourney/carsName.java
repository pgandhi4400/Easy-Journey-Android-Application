package com.example.easyjourney;

public class carsName {
    private int image;
    private String car;
    private String year;
    private String fuel;
    private String price;
    private String seat;


    public carsName(int image,String car,String year,String fuel,String price,String seat){
        this.image=image;
        this.car=car;
        this.fuel=fuel;
        this.year=year;
        this.price=price;
        this.seat=seat;
    }
    public String getCar() {
        return car;
    }

    public String getFuel() {
        return fuel;
    }

    public String getYear() {
        return year;
    }

    public String getPrice() {
        return price;
    }

    public String getSeat() {
        return seat;
    }

    public int getImage() {
        return image;
    }





    public void setImage(int image) {
        this.image=image;
    }

    public void setCar(String car) {
        this.car=car;
    }

    public void setFuel(String fuel) {
        this.fuel=fuel;
    }

    public void setYear(String year) {
        this.year=year;
    }

    public void setPrice(String price) {
        this.price=price;
    }

    public void setSeat(String seat) {
        this.seat=seat;
    }

}
