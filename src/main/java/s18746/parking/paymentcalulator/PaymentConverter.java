package s18746.parking.paymentcalulator;

import java.math.BigDecimal;

public class PaymentConverter {


    public BigDecimal calculateCost(Long hours, BigDecimal parkingPlaceCostPerHour){
        return parkingPlaceCostPerHour.multiply(BigDecimal.valueOf(hours));
    }


}
