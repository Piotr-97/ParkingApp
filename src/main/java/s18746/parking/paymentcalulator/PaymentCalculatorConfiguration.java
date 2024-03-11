package s18746.parking.paymentcalulator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import s18746.parking.parkingspacetimecounter.ParkingSpaceTimeCounterFacade;

@Configuration
public class PaymentCalculatorConfiguration {

    @Bean
    public PaymentCalculatorFacade paymentCalculatorFacade(ParkingSpaceTimeCounterFacade parkingSpaceTimeCounterFacade){
        PaymentConverter paymentConverter = new PaymentConverter();
        return new PaymentCalculatorFacade(paymentConverter,parkingSpaceTimeCounterFacade);

    }


    public PaymentCalculatorFacade paymentCalculatorFacadeForTest(ParkingSpaceTimeCounterFacade parkingSpaceTimeCounterFacade,PaymentConverter paymentConverter){
        return new PaymentCalculatorFacade(paymentConverter,parkingSpaceTimeCounterFacade);
    }

}
