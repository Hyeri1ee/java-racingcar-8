package racingcar.controller;

import camp.nextstep.edu.missionutils.Console;
import racingcar.domain.Car;
import racingcar.domain.Game;
import racingcar.utils.Instructions;
import racingcar.view.Input;

import java.util.List;

public class GameController {//Game 도메인의 메소드 조합 역할

    public void run(){
        System.out.println(Instructions.INPUT_CAR_IN_GAME.getMessage());//enum으로 상수화 => 첫번째 지시문
        String carNamesInput = Console.readLine();

        List<Car> cars = Input.parseCarNames(carNamesInput);//enum으로 상수화-> 두번째 지시문

        System.out.println(Instructions.INPUT_TRY_NUM.getMessage());//enum으로 상수화-> 세번째 지시문
        String attemptInput = Console.readLine();
        int attempts = Input.parseCount(attemptInput);

        Game game = new Game(cars, attempts);
        game.play();//게임시작
        game.printFinalWinner();//최종 우승자
    }
}
