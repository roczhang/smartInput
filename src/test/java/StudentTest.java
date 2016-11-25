import org.junit.Assert;
import org.junit.Test;
import yg.smartinput.model.Grade;
import yg.smartinput.model.Student;
import yg.smartinput.model.ys.smartInput.GPA.HoneyGPAStrategy;

/**
 * Created by I076057 on 11/24/2016.
 */
public class StudentTest {

    @Test
    public void testCreateStudent() {

        final String firstName = "Mr . Smith";
        Student student = new Student(firstName);
        Assert.assertTrue(firstName.equals(student.getName()));

        final String secondName = "Mrs. Smith";
        Student another = new Student(secondName);
        Assert.assertTrue(secondName.equals(another.getName()));

    }


    @Test
    public void testCredits() {

        Student student = new Student("Mrs. Smith");
        Assert.assertTrue(student.getPoints() == 0);

        student.addCredits(Grade.ALevel);
        Assert.assertTrue(student.getPoints() == 4);

        student.addCredits(Grade.BLevel);
        Assert.assertTrue(student.getPoints() == 7);
    }

    @Test
    public void testCalculateDefaultGPA() {

        Student student = new Student("Mrs. Smith");

        student.addCredits(Grade.ALevel);
        Assert.assertTrue(IsDoubleEqual(student.getGPA(), 4));

        student.addCredits(Grade.BLevel);
        Assert.assertTrue(IsDoubleEqual(3.5, student.getGPA()));

        student.addCredits(Grade.CLevel);
        Assert.assertTrue(IsDoubleEqual(3, student.getGPA()));

        student.addCredits((Grade.DLevel));
        Assert.assertTrue(IsDoubleEqual(2.5, student.getGPA()));
    }

    @Test
    public void testHoneyGPA() throws Exception {

        Student student = new Student("Mr. Smith");
        student.setGPAStrategy(new HoneyGPAStrategy());

        student.addCredits(Grade.ALevel);
        student.addCredits(Grade.BLevel);

        Assert.assertTrue(IsDoubleEqual(student.getGPA(), (4 + 3)*1.0 / 2 + 1));

        student.addCredits(Grade.DLevel);
        Assert.assertTrue(IsDoubleEqual(student.getGPA(), (4 + 3 + 1)*1.0 / 3 + 1));

    }

    private boolean IsDoubleEqual(double gpa, double point) {
        return Math.abs(gpa - point) < 0.000001;
    }

}
