import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.Assertion;


public class TC2 {

    // Before every test case
    @BeforeMethod
    public void beforeTest() {
        System.out.println("This will run before every method 222");
    }

    // After every test case
    @AfterMethod
    public void afterTest() {
        System.out.println("This will run after every method 222");
    }

    // Before the test suite
    @BeforeSuite
    public void beforeTestSuite() {
        System.out.println("This will run before the Suite 222");
    }

    // After the test suite
    @AfterSuite
    public void afterTestSuite() {
        System.out.println("This will run after the Suite 222");
    }

    // Before the class
    @BeforeClass
    public void beforeClass() {
        System.out.println("This will run before the class 222");
    }

    // After the class
    @AfterClass
    public void afterClass() {
        System.out.println("This will run after the class 222");
    }


    @Test
    public void setup2() {
        System.out.println("This is setup22 test 222");
    }

    @Test
    public void login2() {
        System.out.println("This is login22 test 222");
    }

}
