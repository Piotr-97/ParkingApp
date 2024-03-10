package s18746.parking.parkingspacetimecounter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ParkingSpaceTimeCounterConfiguration {


    @Bean
    public ParkingSpaceTimeCounterFacade parkingSpaceTimeCounterFacade(){
        TimeCounter timeCounter = new TimeCounter();
        return new ParkingSpaceTimeCounterFacade(timeCounter);
    }


    public ParkingSpaceTimeCounterFacade parkingSpaceTimeCounterFacadeForTest(TimeCounter timeCounter){
        return new ParkingSpaceTimeCounterFacade(timeCounter);
    }
}
