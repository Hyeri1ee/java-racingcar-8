package racingcar.domain.values;

public enum Instructions {
    INPUT_CAR_IN_GAME("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"),
    INPUT_TRY_NUM("시도할 횟수는 몇 회인가요?\n");

    private final String message;

    Instructions(String message) {
        this.message = message;
    }


}
