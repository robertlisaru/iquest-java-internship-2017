package com.iquestint.ju;

import java.util.ArrayList;

public class StringList implements List<String> {

    private java.util.List<String> backEndStringList = new ArrayList<>();

    public java.util.List<String> getOperationsLog() {
        return operationsLog;
    }

    private java.util.List<String> operationsLog = new ArrayList<>();

    public void add(String element) throws StringListOperationException {
        if (element == null || element.equals("")) {
            operationsLog.add("Null element add attempt.");
            throw new StringListOperationException("Null",
                    StringListErrorCode.NULL_ELEMENT);
        }
        try {
            Integer.parseInt(element);
        } catch (NumberFormatException nfe) {
            operationsLog.add("Invalid number add attempt.");
            throw new StringListOperationException("Invalid number.",
                    StringListErrorCode.INVALID_NUMBER_FORMAT);
        }
        backEndStringList.add(element);
        operationsLog.add("Added: " + element);
    }

    public String get(int position) throws StringListOperationException {
        try {
            operationsLog.add("Get from position " + position + ": "
                    + backEndStringList.get(position));
            return backEndStringList.get(position);
        } catch (IndexOutOfBoundsException e) {
            operationsLog.add("Get failed. Index out of bounds.");
            throw new StringListOperationException("Index out of bounds.",
                    StringListErrorCode.INDEX_OUT_OF_BOUNDS);
        }
    }

    public boolean contains(String element) {
        operationsLog.add("Contains " + element + " check.");
        return backEndStringList.contains(element);
    }

    public boolean containsAll(List<String> foreignList) {
        operationsLog.add("Contains all check.");
        for (int i = 0; i < foreignList.size(); i++) {
            if (!this.contains(foreignList.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int size() {
        operationsLog.add("Size requested.");
        return backEndStringList.size();
    }
}
