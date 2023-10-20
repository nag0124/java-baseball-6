package baseball;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GameJudge {

    public List<Integer> judge(int playerNumber, int computerNumber) {
        List<Integer> playerNumberList = separateNumber(playerNumber);
        List<Integer> computerNumberList = separateNumber(computerNumber);

        int strikeCount = countStrike(playerNumberList, computerNumberList);
        int ballCount = countBall(playerNumberList, computerNumberList);
        ballCount -= strikeCount;
        return List.of(strikeCount, ballCount);
    }

    private List<Integer> separateNumber(int number) {
        List<Integer> result = new ArrayList<>();

        while (number != 0) {
            result.add(number % 10);
            number /= 10;
        }
        return Collections.unmodifiableList(result);
    }

    private int countBall(List<Integer> one, List<Integer> other) {
        int result = 0;

        for (Integer number : one) {
            if (other.contains(number)) {
                result++;
            }
        }
        return result;
    }

    private int countStrike(List<Integer> one, List<Integer> other) {
        int result = 0;

        for (int index = 0; index < one.size(); index++) {
            if (one.get(index).equals(other.get(index))) {
                result++;
            }
        }
        return result;
    }

}
