package com.baeldung.deepcopyexample;

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
        var cloned = (Person) super.clone();
        cloned.car = car.clone();
        return cloned;
    }
}

class Car implements Cloneable {

    String brand;
    String color;

    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        return (Car) super.clone();
    }
}
