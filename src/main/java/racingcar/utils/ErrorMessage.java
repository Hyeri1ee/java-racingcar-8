package racingcar.utils;

public enum ErrorMessage {

    //자동차 관련 오류
    CARNAME_NOTEMPTY("자동차 이름은 비어있을 수 없습니다."),
    CARNAME_INFIVE("자동차 이름은 5자 이하여야 합니다."),

    //공통 오류
    INPUT_EMPTY("입력값이 비어있습니다."),

    //숫자 입력 오류
    NUM("시도 횟수는 숫자여야 합니다.");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage(){
        return this.message;
    }
}
