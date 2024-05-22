package com.baeldung.deepcopyexample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PersonDeepCopyTest {

    @Test
    void whenUsingRefinedCloneImplementation_ShouldMakeDeepCopyOfTheObject() throws CloneNotSupportedException {
        //given
        var jane = new Person("Jane", 30, new Car("Mercedes", "YELLOW"));

        //when
        var janeClone = jane.clone();
        janeClone.car.brand = "BMW";

        //then
        Assertions.assertNotEquals(jane.car.brand, janeClone.car.brand);
    }
}