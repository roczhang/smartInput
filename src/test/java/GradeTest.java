import org.junit.Assert;
import org.junit.Test;
import yg.smartinput.model.Grade;

/**
 * Created by I076057 on 11/25/2016.
 */
public class GradeTest {

    @Test
    public void testCreate() throws Exception {

        Grade grade = Grade.ALevel;
        Assert.assertTrue( grade.getPoints() == 4);

    }
}
