package com.baeldung.shallowcopyexample;

class Person implements Cloneable {

    String name;
    int age;
    Car car;

    public Person(String name, int age, Car car) {
        this.name = name;
        this.age = age;
        this.car = car;
    }

    @Override
    public Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }
}

class Car {

    String brand;
    String color;

    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }
}
