package yg.smartinput.model.ys.smartInput.GPA;

import yg.smartinput.model.Grade;

import java.util.List;

/**
 * Created by I076057 on 11/25/2016.
 */
public class HoneyGPAStrategy extends BaseGAPStrategy {

    static final double AWARD = 1;

    @Override
    public double getGPA(List<Grade> list) {

        double points = getPoint(list) / list.size();


        double honeyPoints = points + AWARD;

        return honeyPoints;
    }

}
