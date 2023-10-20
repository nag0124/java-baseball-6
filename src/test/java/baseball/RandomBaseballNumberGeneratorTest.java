package baseball;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RandomBaseballNumberGeneratorTest {

    @Test
    @DisplayName("무작위의 중복이 없는 3자리 숫자가 생성된다. 1000번을 반복한다.")
    void generate() {
        for (int i = 0; i < 1000; i++) {
            // given
            RandomBaseballNumberGenerator generator = new RandomBaseballNumberGenerator();

            // when
            int result = generator.generate();
            int first = result / 100;
            int second = (result % 100) / 10;
            int third = result % 10;

            // then
            SoftAssertions.assertSoftly(assertions -> {
                assertions.assertThat(String.valueOf(result).length()).isEqualTo(3);
                assertions.assertThat(first).isNotEqualTo(second);
                assertions.assertThat(second).isNotEqualTo(third);
                assertions.assertThat(third).isNotEqualTo(first);
            });
        }
    }

}
