package com.iquestgroup.remotelearning.week3.sample1;

import java.util.List;

public class HumanDispatchOperator extends DispatchOperator implements Feedable, SleepingMan {
    private EatBehaviour eatBehaviour = new EatAtRestaurantBehaviour();
    private SleepBehaviour sleepBehaviour = new SleepAtHomeBehaviour();

    @Override
    public void eat() {
        System.out.println("Operator " + getName() + eatBehaviour.eat());
    }

    @Override
    public void sleep() {
        System.out.println("Operator " + getName() + sleepBehaviour.sleep());
    }

    public HumanDispatchOperator(String name, List<TaxiDriver> drivers) {
        super(name, drivers);
    }
}
