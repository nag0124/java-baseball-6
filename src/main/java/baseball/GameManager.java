package baseball;

import java.util.List;

public class GameManager {

    private final NumberScanner scanner = new NumberScanner();
    private final RandomBaseballNumberGenerator generator = new RandomBaseballNumberGenerator();
    private final GameJudge judge = new GameJudge();
    private final Screen screen = new Screen();

    public void playOneGame() {
        int computerNumber = generator.generate();
        boolean hasNextRound = true;

        while (hasNextRound) {
            int playerNumber = scanner.input();
            List<Integer> result = judge.judge(playerNumber, computerNumber);
            screen.printResult(result);
            hasNextRound = checkNextRound(result);
        }
    }

    private boolean checkNextRound(List<Integer> gameResult) {
        if (gameResult.get(0) == 3 && gameResult.get(1) == 0) {
            return false;
        }
        return true;
    }

}
