package racingcar.domain;

import racingcar.utils.ErrorMessage;

public class Car {
    private String name;
    private int position;

    public Car(String name){
        validateName(name);
        this.name = name;
        this.position = 0;
    }

    private void validateName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException(ErrorMessage.CARNAME_NOTEMPTY.getMessage());//깔끔?
        }
        if (name.length() > 5) {
            throw new IllegalArgumentException(ErrorMessage.CARNAME_INFIVE.getMessage());
        }
    }

    public String getName(){
        return this.name;
    }

    public int getPosition(){
        return this.position;
    }

    //자동차가 전진하는 메서드
    public void move(int randomNum) {
        if (randomNum >= 4) {//4 이상인 경우에만 
            this.position++;
        }
    }
}
