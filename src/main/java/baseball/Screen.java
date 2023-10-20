package baseball;

import java.util.List;

public class Screen {

    public void printResult(List<Integer> gameResult) {
        int strikeCount = gameResult.get(0);
        int ballCount = gameResult.get(1);

        if (strikeCount == 3 && ballCount == 0) {
            System.out.println("3스트라이크");
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        }
        if (strikeCount == 0 && ballCount == 0) {
            System.out.println("낫싱");
        }
        System.out.println(ballCount + "볼 " + strikeCount + "스트라이크");
    }

    public void printStart() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

}
