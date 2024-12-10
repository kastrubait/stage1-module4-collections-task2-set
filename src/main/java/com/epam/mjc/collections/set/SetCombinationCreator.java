package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {

        Set<String> intersectionSet1And2 = new HashSet<>(firstSet);
        intersectionSet1And2.retainAll(secondSet);
        intersectionSet1And2.removeAll(thirdSet);

        Set<String> set3Only = new HashSet<>(thirdSet);
        set3Only.removeAll(firstSet);
        set3Only.removeAll(secondSet);

        Set<String> resultSet = new HashSet<>(intersectionSet1And2);
        resultSet.addAll(set3Only);

        return resultSet;
    }
}
