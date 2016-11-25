package yg.smartinput.model.ys.smartInput.GPA;

import yg.smartinput.model.Grade;

import java.util.List;



/**
 * Created by I076057 on 11/25/2016.
 */
public abstract class BaseGAPStrategy implements GPAStrategy {

    @Override
    public double getPoint(List<Grade> credits) {
        return credits.stream().map(grade -> grade.getPoints()).reduce(0, (x, y) -> x + y);
    }

}
