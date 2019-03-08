package com.company.BMI;


public class BmiCounter {
    private double height;
    private double weight;


    public BmiCounter() {

    }

    public BmiCounter(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public double getBMI() {

        return this.weight / (this.height * this.height / 10000);
        
    }

    public String getMessage() {

        if (getBMI() < 18.5) {
            return "Masz niedowagę, przytyj trochę!";
        } else if (getBMI() <= 24.9) {
            return "Bardzo dobrze! Masz odpowiednią wagę dla swojego wzrostu!";
        } else if (getBMI() <= 29.9) {
            return "Twoje BMI wynosi : " + getBMI() +
                    " Masz lekka nadwagę, poćwicz!";
        } else {
            return "Niestety jesteś otyły, zrzuć trochę kilogramów!";
        }


    }

    private double getHeight() {
        return height;
    }

    private void setHeight(double height) {
        this.height = height;
    }

    private double getWeight() {
        return weight;
    }

    private void setWeight(double weight) {
        this.weight = weight;
    }


}


