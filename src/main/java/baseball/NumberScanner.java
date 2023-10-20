package baseball;

import camp.nextstep.edu.missionutils.Console;

public class NumberScanner {

    public int input() {
        System.out.print("숫자를 입력해주세요 : ");
        int number = Integer.parseInt(Console.readLine());

        validate(number);
        return number;
    }

    private void validate(int number) {
        if (number < 0 || String.valueOf(number).length() != 3) {
            throw new IllegalArgumentException();
        }
    }

}
