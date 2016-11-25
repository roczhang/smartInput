import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by I076057 on 11/25/2016.
 */
@RunWith(Suite.class)

@Suite.SuiteClasses({

        GradeTest.class,
        StudentTest.class

})

public class StudentTestSuite {


    @BeforeClass
    public static void setUpClass() {
        System.out.println("test student setup");

    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("test student tearDown");
    }
}

