package com.serenitydojo.datatypes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class WhenWorkingWithFloatingPointNumbersTest {

    //
    // Exercise 1: Convert 27 degrees Celcius to Farenheit
    // The equation is: farenheit = (9 / 5) * celcius + 32
    //
    @Test
    public void convertToFahrenheit() {
        final double celcius = 27.0D;

        final double coefficient = 1.8D;
        final double constant = 32.0D;

        double fahrenheit = (celcius * coefficient) + constant;

        //System.out.println("27°C = " + fahrenheit + "°F!");
        assertThat(fahrenheit, equalTo(80.6));
    }

    //
    // Exercise 2: Convert kilograms to pounds
    // There are 2.20462 pounds in a kilogram
    //
    @Test
    public void convertMetersToFeet() {
        final int weightInKilograms = 50;

        // TODO: Use a floating point calculation to calculate the correct weight in pounds
        final double constant = 2.20462D;
        double weightInPounds = (double) weightInKilograms * constant;

        /*
        String newLine = System.lineSeparator();//This will retrieve line separator dependent on OS.
        System.out.println("How many pounds are there in " + weightInKilograms + " kg?" + newLine + "There are " + weightInPounds + "!");
        */

        assertThat(weightInPounds, equalTo(110.231));


    }
}
