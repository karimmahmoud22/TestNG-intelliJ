import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.Assertion;


public class TC1 {

    // Before every test case
    @BeforeMethod
    public void beforeTest() {
        System.out.println("This will run before every method");
    }

    // After every test case
    @AfterMethod
    public void afterTest() {
        System.out.println("This will run after every method");
    }


    // Before the test suite
    @BeforeTest
    public void beforeTestSuite() {
        System.out.println("This will run before the Test");
    }

    // After the test suite
    @AfterTest
    public void afterTestSuite() {
        System.out.println("This will run after the Test ");
    }


    // Before the class
    @BeforeClass
    public void beforeClass() {
        System.out.println("This will run before the class");
    }

    // After the class
    @AfterClass
    public void afterClass() {
        System.out.println("This will run after the class");
    }

    @Test
    public void setup1() {
        System.out.println("This is setup test 111");
    }

    @Test
    public void login1() {
        System.out.println("This is login test 111");
    }

}
