package com.iquestint.ju;

import java.util.ArrayList;

public class StringList implements List<String> {

    private java.util.List<String> backEndStringList = new ArrayList<>();

    public void add(String element) throws StringListOperationException {
        if (element == null || element == "") {
            throw new StringListOperationException("Null");
        }
        try {
            Integer.parseInt(element);
        } catch (NumberFormatException nfe) {
            throw new StringListOperationException("Invalid number.");
        }
        backEndStringList.add(element);
    }

    public String get(int position) throws StringListOperationException {
        try {
            return backEndStringList.get(position);
        } catch (IndexOutOfBoundsException e) {
            throw new StringListOperationException("Index out of bounds.");
        }
    }

    public boolean contains(String element) {
        return backEndStringList.contains(element);
    }

    public boolean containsAll(List<String> foreignList) {
        for (int i = 0; i < foreignList.size(); i++) {
            if (!this.contains(foreignList.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int size() {
        return backEndStringList.size();
    }
}
