package yg.smartinput.model;

import yg.smartinput.model.ys.smartInput.GPA.GPAStrategy;
import yg.smartinput.model.ys.smartInput.GPA.RegularGPAStrategy;

import java.util.ArrayList;

/**
 * Created by I076057 on 11/24/2016.
 */
public class Student {

    private String name;
    private ArrayList<Grade> credits = new ArrayList<Grade>();
    private yg.smartinput.model.ys.smartInput.GPA.GPAStrategy GPAStrategy = new RegularGPAStrategy();

    public Student(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }


    public void addCredits(Grade credit) {
        this.credits.add(credit);
    }

    public double getGPA() {

        return this.GPAStrategy.getGPA(this.credits);

    }


    public void setGPAStrategy(GPAStrategy GPAStrategy) {
        this.GPAStrategy = GPAStrategy;
    }

    public double getPoints() {

        return this.GPAStrategy.getPoint(credits);
    }
}
