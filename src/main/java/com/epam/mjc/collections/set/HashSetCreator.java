package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {

        HashSet<Integer> set = new HashSet<>();

        for (Integer num : sourceList) {
            if (num % 2 != 0) {
                set.add(num);
                set.add(2 * num);
            } else {
                set.add(num);
                int element = num;
                while((element % 2) == 0) {
                    element = element / 2;
                    set.add(element);
                }
            }
        }

        return set;
    }
}
