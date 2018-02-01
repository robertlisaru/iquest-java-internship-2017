package com.iquestint.ju;

public interface List<T> {

    void add(T element);

    T get(int position);

    boolean contains(T element);

    boolean containsAll(List<T> foreignList);

    int size();
}
