package baseball;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        System.out.println("숫자 야구 게임을 시작합니다.");
        GameManager manager = new GameManager();
        boolean doesPlayerWantGame = true;

        while (doesPlayerWantGame) {
            manager.playOneGame();
            doesPlayerWantGame = checkPlayerWantsGame();
        }
    }

    private static boolean checkPlayerWantsGame() {
        while (true) {
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            int reply = Integer.parseInt(Console.readLine());

            if (reply == 1) {
                return true;
            }
            if (reply == 2) {
                return false;
            }
        }
    }
}
