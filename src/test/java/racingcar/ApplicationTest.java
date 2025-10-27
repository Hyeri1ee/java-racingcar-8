package racingcar;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.Test;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ApplicationTest extends NsTest {
    private static final String MOVING_FORWARD = "4";
    private static final String STOP = "3";

    private static final String result_msg = "최종 우승자";
    private static final String CARNAME_INFIVE = "자동차 이름은 5자 이하여야 합니다.";
    @Test
    void 다섯자이하_정상작동() {//given = input, when/then = assert
        String[] input = {"pobi, javai,,",MOVING_FORWARD};
        run(input);//해당 부분은 missionUtils NsTest 활용
        String result = output();
        //값이 특정될수 없고 예측 불가능한 경우 어떻게 테스트를 하는게 효과적인지
        //우선 출력 패턴만 검증
        assertThat(result)
                .contains(result_msg);
    }

    @Test
    void 예외_테스트() {
        String[] input = {"pobi, java33i,,",MOVING_FORWARD};
        //run(input);
        //String result = output();
        //우선 메시지 오류만 검증
        assertThatThrownBy(() -> run(input))
                .hasMessageContaining(CARNAME_INFIVE);//다섯자 이상 오류
    }

    @Override
    public void runMain() {
        Application.main(new String[]{});
    }
}
