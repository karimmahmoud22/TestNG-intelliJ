import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class SecondTestCase {

    @Test(priority = 1)
    public void setup() {
        System.out.println("This is setup test 222");
    }

    @Test(priority = 2)
    public void login() {
        System.out.println("This is login test 222");
    }

    @Test(priority = 3)
    public void teardown() {
        System.out.println("This is teardown test 222");
        Assert.assertEquals(1, 1);
    }


}
