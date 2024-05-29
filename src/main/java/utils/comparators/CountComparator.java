package utils.comparators;

import java.util.Comparator;
import java.util.Map;

public class CountComparator implements Comparator<Integer> {
    private final Map<Integer, Integer> map;

    public CountComparator(Map<Integer,Integer> map) {
        this.map = map;
    }

    @Override
    public int compare(Integer a, Integer b) {
        int aCount = this.map.getOrDefault(a, 0);
        int bCount = this.map.getOrDefault(b, 0);

        return Integer.compare(bCount, aCount);
    }
}
