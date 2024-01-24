import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyExample {

    @Test
    void startCar() {
        System.out.println("Car started");
        Assert.fail();
    }

    // The following method will be executed only if the dependency passes
    @Test(dependsOnMethods = {"startCar"})
    void driveCar() {
        System.out.println("Car driving");
    }

    // The following method will be executed only if the dependency passes
    @Test(dependsOnMethods = {"driveCar"})
    void stopCar() {
        System.out.println("Car stopped");
    }

    // Always run the following method even if the dependency fails
    @Test(dependsOnMethods = {"driveCar","stopCar"}, alwaysRun = true)
    void parkCar() {
        System.out.println("Car parked");
    }
}
