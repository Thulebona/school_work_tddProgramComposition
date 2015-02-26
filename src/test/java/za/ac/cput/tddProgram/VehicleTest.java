package za.ac.cput.tddProgram;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class VehicleTest  {
    @Test
    public void testVehicle() throws Exception {

        Vehicle veh = new Vehicle("BMW","X6",2010,"SUV");

        Assert.assertSame("SUV",veh.getV_type());

    }
    
}