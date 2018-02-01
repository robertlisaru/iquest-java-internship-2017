package com.iquestgroup.ju;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class SentenceGeneratorTest {

    private SentenceGenerator sentenceGenerator;

    @Before
    public void setUp() {
        sentenceGenerator = new SentenceGenerator();
    }

    @Test
    public void testEndingPeriod() {
        String generated = sentenceGenerator.generate();
        assertEquals(generated.charAt(generated.length()-1), '.');
    }

    @Test
    public void testStartingCapitalLetter() {
        String generated = sentenceGenerator.generate();
        assertTrue(Character.isUpperCase(generated.charAt(0)));
    }
}
