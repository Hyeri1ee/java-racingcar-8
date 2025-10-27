package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.domain.values.Instructions;
import racingcar.domain.values.PrintBar;

import java.util.*;

public class Game {
    private int trynum;
    private List<Car> carList;
    private List<String> winners = findWinners();//우승자->게임 종료 후 출력용

    public Game(List<Car> carList, int trynum){
        this.carList = carList;
        this.trynum = trynum;
    }

    //Game 내 실행 메소드=======
    
    //게임 시작 => 
    public void play() {
        System.out.println();
        System.out.println(Instructions.RESULT);

        //게임 trynum만큼 반복하기
        for (int i = 0; i <trynum; i++) {
            oneRound();
            printGameStatus();
            System.out.println();
        }
    }

    private void oneRound() {
        for (Car car : carList) {
            int rand = Randoms.pickNumberInRange(0, 9);
            car.move(rand);//Car에 위임
        }
    }

    //현재 게임 진행 결과 출력
    private void printGameStatus(){
        for (Car car : carList) {
            System.out.println(car.getName() + " : " + getBar(car.getPosition()));
        }
    }

    private String getBar(int position) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < position; i++) {
            sb.append(PrintBar.BAR);//그냥 단순 car의 position 가시화
        }
        return sb.toString();
    }

    public void printFinalWinner(){//우승자 출력하기
        winners = findWinners();
        System.out.print(Instructions.FINAL_WINNER);
        System.out.println(String.join(", ", winners));
    }

    private List<String> findWinners() {
        int maxPosition = 0;
        for (Car car : carList) {
            maxPosition = Math.max(maxPosition, car.getPosition());
        }

        List<String> winners = new ArrayList<>();
        for (Car car : carList) {
            if (car.getPosition() == maxPosition) {
                winners.add(car.getName());
            }
        }

        return winners;
    }
}
