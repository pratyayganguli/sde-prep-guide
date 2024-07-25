package com.interview.javaconcepts.version.java21;

import java.util.ArrayList;
import java.util.SequencedCollection;

/**
 * @author pratyayganguli
 */
class SequencedCollectionsExample {

    public static void main(String[] args) {
        SequencedCollection<Integer> sequencedCollection = new ArrayList<>();
        sequencedCollection.addFirst(1001);
        sequencedCollection.add(1002);
        sequencedCollection.add(1003);
        sequencedCollection.add(1004);
        System.out.println(sequencedCollection);
    }
}
