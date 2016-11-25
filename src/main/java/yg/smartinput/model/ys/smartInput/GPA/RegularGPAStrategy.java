package yg.smartinput.model.ys.smartInput.GPA;

import yg.smartinput.model.Grade;

import java.util.List;

/**
 * Created by I076057 on 11/25/2016.
 */
public class RegularGPAStrategy extends BaseGAPStrategy {


    @Override
    public double getGPA(List<Grade> list) {

        return this.getPoint(list) / list.size();
    }


}
