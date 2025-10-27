package racingcar.controller;

import camp.nextstep.edu.missionutils.Console;
import racingcar.domain.Car;
import racingcar.domain.Game;
import racingcar.domain.values.Instructions;
import racingcar.view.Input;

import java.util.List;

public class GameController {

    public void run(){
        System.out.println(Instructions.INPUT_CAR_IN_GAME);
        String carNamesInput = Console.readLine();
        List<Car> cars = Input.parseCarNames(carNamesInput);

        System.out.println(Instructions.INPUT_TRY_NUM);
        String attemptInput = Console.readLine();
        int attempts = Input.parseCount(attemptInput);

        Game game = new Game(cars, attempts);
        game.play();
        game.printFinalWinner();
    }
}
