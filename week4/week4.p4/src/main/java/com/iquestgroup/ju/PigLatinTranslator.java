package com.iquestgroup.ju;

import java.util.StringTokenizer;

public class PigLatinTranslator {
    public void translate(String input) {
        StringTokenizer st = new StringTokenizer(input);
        while (st.hasMoreTokens()) {
            printLatinWord(st.nextToken());
        }
    }

    public void printLatinWord(String word) {
        System.out.print(word.substring(1) + word.substring(0, 1) + "ay" + " ");
    }
}
