package com;
/*
1) на свое усмотрение(прояви творчество) — напиши программу с демонстрацией поверхностного клонирования
*/

import com.models.Car;
import com.models.Engine;

public class Task1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car car = new Car("Toyota", "sedan", new Engine(3));
        Object carNew = car.clone();
        System.out.println(car);
        System.out.println(carNew);
        car.getEngine().setCapacity(4);
        System.out.println("<<<<<<After changes>>>>>>");
        System.out.println(car);
        System.out.println(carNew);
    }
}
