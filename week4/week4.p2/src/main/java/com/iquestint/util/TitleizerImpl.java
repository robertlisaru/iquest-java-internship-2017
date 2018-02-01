package com.iquestint.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class TitleizerImpl implements Titleizer {

    private List<String> wordsToIgnore = new ArrayList<>(Arrays.asList("is", "the", "a", "to", "in", "of"));

    public String titleize(String toTitleize) {
        if (toTitleize == null) {
            throw new IllegalArgumentException();
        }
        if (toTitleize.equals("")) {
            return "";
        }

        StringBuilder titleized = new StringBuilder();

        StringTokenizer st = new StringTokenizer(toTitleize);
        while (st.hasMoreTokens()) {
            String word = st.nextToken();
            String capitalizedWord = word;
            if (!wordsToIgnore.contains(word)) {
                capitalizedWord = word.replaceFirst("\\Q" + word.substring(0, 1) + "\\E",
                        word.substring(0, 1).toUpperCase());
            }
            titleized.append(capitalizedWord);
            titleized.append(" ");
        }
        titleized.deleteCharAt(titleized.length() - 1);

        return titleized.toString();
    }
}
