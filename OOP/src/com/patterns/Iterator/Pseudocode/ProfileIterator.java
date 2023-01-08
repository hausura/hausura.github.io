package com.patterns.Iterator.Pseudocode;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}