package com.iquestgroup.remotelearning.week3.sample1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<TaxiDriver> drivers = new ArrayList<>();
        HumanTaxiDriver vlad = new HumanTaxiDriver("Vlad");
        drivers.add(vlad);
        SelfDrivingCar alphaDrive = new SelfDrivingCar("AlphaDrive");
        drivers.add(alphaDrive);

        DispatchOperator operator = new HumanDispatchOperator("Dan", drivers);
        DispatchOperator automatedOperator = new AutomatedDispatchOperator("AlphaDispatch", drivers);

        automatedOperator.dispatch("Str. Independentei nr. 7");
        operator.dispatch("Calea Motilor nr. 6");

        List<Feedable> lunchMates = new ArrayList<>();
        lunchMates.add(vlad);
        lunchMates.add((HumanDispatchOperator) operator);
        lunchTime(lunchMates);

        List<SleepingMan> sleepingMen = new ArrayList<>();
        sleepingMen.add(vlad);
        sleepingMen.add((HumanDispatchOperator) operator);
        bedTime(sleepingMen);
    }

    private static void lunchTime(List<Feedable> lunchMates) {
        for (Feedable f : lunchMates) {
            f.eat();
        }
    }

    private static void bedTime(List<SleepingMan> sleepingMen) {
        for (SleepingMan s : sleepingMen) {
            s.sleep();
        }
    }
}
