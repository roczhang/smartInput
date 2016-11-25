package yg.smartinput.model;

/**
 * Created by I076057 on 11/24/2016.
 */
public class PatientCost {

    private float selfCost;
    private float compensationCost;


    public PatientCost(float selfCost, float compentationCost) {

        this.selfCost = selfCost;
        this.compensationCost = compentationCost;
    }

    public float getSelfCost() {
        return this.selfCost;
    }

    public void setSelfCost(float selfCost) {
        this.selfCost = selfCost;
    }

    public float getCompensationCost() {
        return compensationCost;
    }

    public void setCompensationCost(float compentationCost) {
        this.compensationCost = compentationCost;
    }

    public float getTotalCost() {
        return getSelfCost() + getCompensationCost();
    }

    public void setTotalwithComponensationCost(float totalCost, float compensation) {
        this.selfCost = totalCost - compensation;
        this.compensationCost = compensation;
    }
}
