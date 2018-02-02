package com.iquestint.ju;

public class Main {
    public static void main(String args[]) {
        StringList stringList = new StringList();
        stringList.add("66");
        stringList.add("44");
        System.out.println("At position 1: " + stringList.get(1));
        try {
            stringList.get(2);
        } catch (StringListOperationException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Contains 44: " + stringList.contains("44"));
        System.out.println("Size: " + stringList.size());
        System.out.println("Log: " + stringList.getOperationsLog());
    }
}
