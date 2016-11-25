package yg.smartinput.model.ys.smartInput.GPA;

import yg.smartinput.model.Grade;

import java.util.List;

/**
 * Created by I076057 on 11/25/2016.
 */
public interface GPAStrategy {

    double getGPA(List<Grade> list);

    double getPoint(List<Grade> credits);
}
