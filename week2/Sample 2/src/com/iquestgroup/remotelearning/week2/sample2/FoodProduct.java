package com.iquestgroup.remotelearning.week2.sample2;

import java.util.Date;

public class FoodProduct extends Product {
    protected int noCalories;
    protected Date expirationDate;

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getNoCalories() {
        return noCalories;
    }

    public void setNoCalories(int noCalories) {
        this.noCalories = noCalories;
    }
}
