package za.ac.cput.tddProgram.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.tddProgram.Vehicle;

/**
 * Created by student on 2015/02/26.
 */
@Configuration
public class AppConfig {

    @Bean(name ="model")
    public Vehicle getVehicle(){
        return new Vehicle();
    }

}
