package za.ac.cput.tddProgram;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class VehicleTest  {
    @Test
    public void testVehicle() throws Exception {

        Car SpotCar = new Car();
        Car otherCar = new Car("VW","GTI",2005,"Truck");

        SpotCar.setV_maker("VW");
        SpotCar.setV_model("GTI");
        SpotCar.setV_year(2005);
        SpotCar.setV_type("Spot car");

        Assert.assertSame(SpotCar.getV_type(), otherCar.getV_type());

    }
    
}