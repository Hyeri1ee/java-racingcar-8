package racingcar.domain.values;

public enum PrintBar {

    BAR("-");

    private final String shape;

    PrintBar(String shape) {
        this.shape = shape;
    }

    public String getShape(){
        return shape;
    }

}
