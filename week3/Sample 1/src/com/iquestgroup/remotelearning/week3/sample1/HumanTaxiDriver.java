package com.iquestgroup.remotelearning.week3.sample1;

public class HumanTaxiDriver extends TaxiDriver implements Feedable, SleepingMan {
    private EatBehaviour eatBehaviour = new EatInCarBehaviour();
    private SleepBehaviour sleepBehaviour = new SleepAtHomeBehaviour();

    public HumanTaxiDriver(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Driver " + getName() + eatBehaviour.eat());
    }

    @Override
    public void sleep() {
        System.out.println("Driver " + getName() + sleepBehaviour.sleep());
    }
}
