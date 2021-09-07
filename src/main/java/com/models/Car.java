package com.models;

public class Car implements Cloneable{
    private String brand;
    private String bodyType;
    private Engine engine;

    public Car(String brand, String bodyType, Engine engine) {
        this.brand = brand;
        this.bodyType = bodyType;
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return (Car) super.clone();
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", bodyType='" + bodyType + '\'' +
                "Engine=" + engine +
                '}';
    }
}
