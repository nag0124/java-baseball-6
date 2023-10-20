package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.HashSet;
import java.util.Set;

public class RandomBaseballNumberGenerator {

    public int generate() {
        Set<Integer> set = new HashSet<>();

        while (set.size() < 3) {
            set.add(Randoms.pickNumberInRange(1, 9));
        }
        return stringifyNumbers(set);
    }

    private int stringifyNumbers(Set<Integer> set) {
        int result = 0;

        for (int number : set) {
            result = result * 10 + number;
        }
        return result;
    }

}
