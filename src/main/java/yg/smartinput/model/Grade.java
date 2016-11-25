package yg.smartinput.model;

/**
 * Created by I076057 on 11/25/2016.
 */
public enum Grade {
    ALevel(4),
    BLevel(3),
    CLevel(2),
    DLevel(1);

    private int points;

    Grade(int points){
        this.points = points;
    }

    public int getPoints() {
        return points;
    }
}
