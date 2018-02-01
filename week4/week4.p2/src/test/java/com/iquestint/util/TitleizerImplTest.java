package com.iquestint.util;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TitleizerImplTest {

    private Titleizer titleizer;

    @Before
    public void setUp() {
        titleizer = new TitleizerImpl();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTitleizeForNullShouldThrowException() throws Exception {
        titleizer.titleize(null);
    }

    @Test
    public void testTitleizeForEmptyStringShouldReturnEmptyString() {
        //WHEN
        String actualResult = titleizer.titleize("");

        //THEN
        assertThat(actualResult, is(""));
    }

    @Test
    public void testTitleizeForTitleizedString() throws Exception {
        //WHEN
        String actualResult = titleizer.titleize("Already Titleized String");

        //THEN
        assertThat(actualResult, is("Already Titleized String"));
    }

    @Test
    public void testTitleizeShouldIgnorePrepositionsString() throws Exception {
        //WHEN
        String actualResult = titleizer.titleize("This String is Titleized");

        //THEN
        assertThat(actualResult, is("This String is Titleized"));
    }

    @Test
    public void testTitleizeWhenFirstWordIsPreposition() throws Exception {
        //WHEN
        String actualResult = titleizer.titleize("this String is Titleized");

        //THEN
        assertThat(actualResult, is("This String is Titleized"));
    }

    @Test
    public void testTitleize() throws Exception {
        //WHEN
        String actualResult = titleizer.titleize("please titleize me");

        //THEN
        assertThat(actualResult, is("Please Titleize Me"));
    }

}
