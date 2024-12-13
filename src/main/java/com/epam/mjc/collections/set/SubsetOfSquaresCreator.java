package com.epam.mjc.collections.set;

import java.util.TreeSet;
import java.util.List;
import java.util.Set;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {

        TreeSet<Integer> squareSet = new TreeSet<>();

        for (Integer num : sourceList) {
            squareSet.add(num * num);
        }

        return squareSet.subSet(lowerBound, true, upperBound, true);
    }
}
