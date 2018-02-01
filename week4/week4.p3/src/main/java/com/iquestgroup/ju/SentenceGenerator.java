package com.iquestgroup.ju;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SentenceGenerator {
    private List<String> articles = new ArrayList<>(Arrays.asList("the", "a", "one", "some", "any"));
    private List<String> nouns = new ArrayList<>(Arrays.asList("boy", "girl", "dog", "town", "car"));
    private List<String> prepositions = new ArrayList<>(Arrays.asList("to", "from", "over", "under", "on"));
    private List<String> verbs = new ArrayList<>(Arrays.asList("drove", "jumped", "ran", "walked", "skipped"));

    public String generate() {
        Random rand = new Random();
        StringBuilder sentence = new StringBuilder();

        String article = articles.get(rand.nextInt(articles.size()));
        sentence.append(article.substring(0, 1).toUpperCase());
        sentence.append(article.substring(1));
        sentence.append(" ");

        String noun = nouns.get(rand.nextInt(nouns.size()));
        sentence.append(noun);
        sentence.append(" ");

        String verb = verbs.get(rand.nextInt(verbs.size()));
        sentence.append(verb);
        sentence.append(" ");

        String preposition = prepositions.get(rand.nextInt(prepositions.size()));
        sentence.append(preposition);
        sentence.append(" ");

        article = articles.get(rand.nextInt(articles.size()));
        sentence.append(article);
        sentence.append(" ");

        noun = nouns.get(rand.nextInt(nouns.size()));
        sentence.append(noun);
        sentence.append(".");

        return sentence.toString();
    }

    public static void main(String args[]) {
        SentenceGenerator g = new SentenceGenerator();
        for (int i = 0; i < 20; i++) {
            System.out.println(g.generate());
        }
    }

}
