package com.serenitydojo.datatypes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class WhenWorkingWithWholeNumbersTest {
    @Test
    public void addingNumbersTogether() {
        final int initialYear = 1985;

        final int timeJump = 30;

        int targetYear = initialYear + timeJump;
        //System.out.println("targetYear = " + targetYear);

        assertThat(targetYear, equalTo(2015));

    }
}
