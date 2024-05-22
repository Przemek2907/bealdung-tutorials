package com.baeldung.shallowcopyexample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PersonShallowCopyTest {


    @Test
    void whenUsingCloneNaiveImplementation_ShouldMakeShallowCopyOfTheObject() throws CloneNotSupportedException {
        //given
        var jane = new Person("Jane", 30, new Car("Mercedes", "YELLOW"));

        //when
        var janeClone = jane.clone();
        janeClone.name = "Jane The Second";
        janeClone.car.brand = "BMW";
        janeClone.age = 20;

        //then
        Assertions.assertNotEquals(jane.name, janeClone.name);
        Assertions.assertNotEquals(jane.age, janeClone.age);
        Assertions.assertEquals(jane.car.brand, janeClone.car.brand);
    }
}