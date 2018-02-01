package com.iquestgroup.ju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
        PigLatinTranslator translator = new PigLatinTranslator();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter sentence to be translated or 'q' to quit.");
        System.out.print("Sentence: ");
        String sentence = br.readLine();
        while (!sentence.equals("q")) {
            translator.translate(sentence);
            System.out.print("\nSentence: ");
            sentence = br.readLine();
        }
    }
}
