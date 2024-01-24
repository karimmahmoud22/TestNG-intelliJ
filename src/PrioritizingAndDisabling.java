import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class PrioritizingAndDisabling {

    // The following methods will be executed according to the priority

    @Test(priority = 1)
    public void setup() {
        System.out.println("This is setup test 222");
    }

    // The following method will be disabled
    @Test(priority = 2, enabled = false)
    public void login() {
        System.out.println("This is login test 222");
    }

    @Test(priority = 3)
    public void teardown() {
        System.out.println("This is teardown test 222");
    }

    /*

    // The following methods will be executed in alphabetical order

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
    }

     */

}
