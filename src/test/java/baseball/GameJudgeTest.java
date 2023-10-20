package baseball;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class GameJudgeTest {

    private final GameJudge judge = new GameJudge();

    @Test
    @DisplayName("숫자가 일치하면 (3,0)의 리스트를 반환한다.")
    void judge3N0List() {
        // given
        int one = 123;
        int other = 123;

        // when
        List<Integer> result = judge.judge(one, other);

        // then
        SoftAssertions.assertSoftly(assertions -> {
            assertions.assertThat(result.get(0)).isEqualTo(3);
            assertions.assertThat(result.get(1)).isEqualTo(0);
        });
    }

    @Test
    @DisplayName("겹치는 숫자가 없으면 (0.0)의 리스트를 반환한다.")
    void judge0N0List() {
        // given
        int one = 123;
        int other = 456;

        // when
        List<Integer> result = judge.judge(one, other);

        // then
        SoftAssertions.assertSoftly(assertions -> {
            assertions.assertThat(result.get(0)).isEqualTo(0);
            assertions.assertThat(result.get(1)).isEqualTo(0);
        });
    }

    @Test
    @DisplayName("일치하는 숫자가 1개고 겹치는 숫자가 1개면 (1.1)의 리스트를 반환한다.")
    void judge1N1List() {
        // given
        int one = 123;
        int other = 142;

        // when
        List<Integer> result = judge.judge(one, other);

        // then
        SoftAssertions.assertSoftly(assertions -> {
            assertions.assertThat(result.get(0)).isEqualTo(1);
            assertions.assertThat(result.get(1)).isEqualTo(1);
        });
    }

    @Test
    @DisplayName("일치하는 숫자가 없고 겹치는 숫자가 3개면 (0.3)의 리스트를 반환한다.")
    void judge0N3List() {
        // given
        int one = 123;
        int other = 231;

        // when
        List<Integer> result = judge.judge(one, other);

        // then
        SoftAssertions.assertSoftly(assertions -> {
            assertions.assertThat(result.get(0)).isEqualTo(0);
            assertions.assertThat(result.get(1)).isEqualTo(3);
        });
    }
}
