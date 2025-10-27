package racingcar.view;

import racingcar.domain.Car;
import racingcar.utils.ErrorMessage;

import java.util.ArrayList;
import java.util.List;

public class Input {

    //자동차에 대한 입력값 나누기
    public static List<Car> parseCarNames(String input) {
        validateIsEmpty(input);

        String[] names = input.split(",");
        List<Car> cars = new ArrayList<>();

        for (String name : names) {//각각의 나눈 값 빈 값인지 확인
            String trimmedName = name.trim();
            if (trimmedName.isEmpty()) {
                throw new IllegalArgumentException(ErrorMessage.CARNAME_NOTEMPTY.getMessage());
            }
            cars.add(new Car(trimmedName));
        }

        return cars;
    }


    //숫자에 대한 입력값
    public static int parseCount(String input) {
        validateIsEmpty(input);

        try {
            return Integer.parseInt(input.trim());

        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ErrorMessage.NUM.getMessage());
        }
    }

    //위 두 함수에 공통 적용
    private static void validateIsEmpty(String input) {
        if (input == null || input.trim().isEmpty()) {
            throw new IllegalArgumentException(ErrorMessage.INPUT_EMPTY.getMessage());
        }
    }
}
