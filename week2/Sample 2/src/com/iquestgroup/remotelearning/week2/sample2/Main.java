package com.iquestgroup.remotelearning.week2.sample2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<FoodProduct> products = new ArrayList<>();
        products.add(new Chocolate());

        printExpirationDateStatistics(products);
    }

    private static void printExpirationDateStatistics(List<FoodProduct> foodProducts) {
        for (FoodProduct product : foodProducts) {
            System.out.println(product.getExpirationDate());
        }
    }
}
