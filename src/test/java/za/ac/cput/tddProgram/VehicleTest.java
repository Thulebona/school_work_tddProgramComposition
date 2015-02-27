package za.ac.cput.tddProgram;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.tddProgram.config.AppConfig;

/**
 * Unit test for simple App.
 */
public class VehicleTest  {
    private Vehicle veh;
    private ApplicationContext ctx;


    @Before
    public void setUp() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        veh = new Vehicle();
    }

    @Test
    public void testVehicle() throws Exception {
        veh.setVehicle("BMW","X6",2011,"SUV");
        Assert.assertSame("SUV",veh.getV_type());
    }

    @After
    public void tearDown() throws Exception {


    }
}