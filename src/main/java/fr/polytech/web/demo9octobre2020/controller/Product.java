package fr.polytech.web.demo9octobre2020.controller;

public class Product {

    private int code;
    private String designation;
    private double prix;

    public void setCode(int code) {
        this.code = code;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getCode() {
        return code;
    }

    public String getDesignation() {
        return designation;
    }

    public double getPrix() {
        return prix;
    }

    public Product(int code, String designation, double prix) {
        this.code = code;
        this.designation = designation;
        this.prix = prix;
    }
}
