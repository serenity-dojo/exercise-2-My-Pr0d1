package com.serenitydojo.datatypes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class WhenWorkingWithStringsTest {

    @Test
    public void convertToLowerCase() {
        final String bookTitle = "The Cat In The Hat";

        String lowerCaseTitle = bookTitle.toLowerCase();
        //System.out.println(bookTitle + " changed into lower case: " + lowerCaseTitle);

        assertThat(lowerCaseTitle, equalTo("the cat in the hat"));

    }

    @Test
    public void convertToUpperCase() {
        final String bookTitle = "The Cat In The Hat";

        String upperCaseTitle = bookTitle.toUpperCase();
        //System.out.println(bookTitle + " changed into upper case: " + upperCaseTitle);

        assertThat(upperCaseTitle, equalTo("THE CAT IN THE HAT"));
    }

    @Test
    public void trimExtraSpaces() {
        final String bookTitle = "  The Cat In The Hat    ";

        String trimmedTitle = bookTitle.trim();

        /*
        String newLine = System.lineSeparator();//This will retrieve line separator dependent on OS.
        System.out.println(bookTitle + newLine + trimmedTitle + " (trimmed now!)");
        */


        assertThat(trimmedTitle, equalTo("The Cat In The Hat"));
    }

    @Test
    public void findTheLengthOfAString() {
        final String bookTitle = "The Cat In The Hat";

        int length = bookTitle.length();

        //System.out.println("Length of the book title: " + bookTitle + " = " + length);
        assertThat(length, equalTo(18));
    }

    @Test
    public void replacingAText() {
        final String bookTitle = "The Cat In The Hat";

        String updatedTitle = bookTitle.replace("Cat", "Dog");
        //System.out.println("Updated the book title " + bookTitle + " = " + updatedTitle);

        assertThat(updatedTitle, equalTo("The Dog In The Hat"));
    }
}
