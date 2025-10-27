package racingcar.domain;

import camp.nextstep.edu.missionutils.Console;
import racingcar.domain.values.Instructions;
import racingcar.domain.values.PrintBar;

import java.util.*;

public class Game {
    private int trynum;
    private List<Car> carList = new ArrayList<>();
    private List<Integer> currentBarList = new ArrayList<>();

    public Game(int trynum, List<Car> carList){
        this.trynum = trynum;
        this.carList = carList;
    }

    //Game 내 실행 메소드
    //처음 명령어
    public void printInstruction(){
        System.out.println(Instructions.INPUT_CAR_IN_GAME);

        //빈 문자열을 제거하고 trim 하여 문자열 뽑아내기
        String[] inputs = Arrays.stream(Console.readLine().split(","))
                .map(String::trim)
                .filter(s -> !s.isEmpty())
                .toArray(String[]::new);

        for(String input : inputs){
            this.carList.add(new Car(input));
        }

    }

    //(현)게임 진행 결과 출력
    public void printGameStatus(){
        for(int i = 0 ; i  < carList.size() ; i++){
            Car car = carList.get(i);
            int currentBar = currentBarList.get(i);

            System.out.println(car.getName() + " : " + showBar(currentBar, PrintBar.BAR));
        }
    }

    //막대기 부분 출력
    private StringBuilder showBar(int num, PrintBar bar){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< num ;i++){
            sb.append(bar);
        }

        return sb;
    }


    public void printFinalWinner(){

    }
}
