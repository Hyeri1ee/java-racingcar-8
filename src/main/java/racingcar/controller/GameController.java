package racingcar.controller;

import camp.nextstep.edu.missionutils.Console;
import racingcar.domain.Car;
import racingcar.domain.Game;
import racingcar.domain.values.Instructions;
import racingcar.view.Input;

import java.util.List;

public class GameController {

    //GameController로 Game에서의 메소드 조합하기
    public void run(){

        System.out.println(Instructions.INPUT_CAR_IN_GAME);
        String carNamesInput = Console.readLine();
        List<Car> cars = Input.parseCarNames(carNamesInput);

        System.out.println(Instructions.INPUT_TRY_NUM);
        String attemptInput = Console.readLine();
        int attempts = Input.parseCount(attemptInput);

        Game game = new Game(cars, attempts);
        game.play();//게임시작
        game.printFinalWinner();//최종 우승자
    }
}
