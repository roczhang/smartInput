import org.junit.Assert;
import org.junit.Test;
import yg.smartinput.model.PatientCost;

/**
 * Created by I076057 on 11/24/2016.
 */
public class PatientCostTest  {




    @Test
    public  void TestTotalCost()
    {

        PatientCost patientCost = new PatientCost(10, 20);
        Assert.assertTrue( IsZero( patientCost.getTotalCost() - 30) );

    }

    @Test
    public  void  ModifySelfPayTest()
    {
        PatientCost patientCost = new PatientCost(10, 20);
        patientCost.setSelfCost(20);
        Assert.assertTrue(  IsZero(patientCost.getSelfCost() - 20)  );
    }


    @Test
    public  void SetCompensationAndTotalCostTest()
    {
        PatientCost patientCost = new PatientCost(10, 20);

        patientCost.setTotalwithComponensationCost(40.0f, 20.0f);

        Assert.assertTrue( IsZero(patientCost.getSelfCost() - 20));
    }


    private boolean IsZero( float x )
    {
        return Math.abs( x ) < 0.000001;
    }
}
