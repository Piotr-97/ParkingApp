package s18746.parking.paymentcalulator;

import org.junit.jupiter.api.Test;
import s18746.parking.parkingreservation.dto.ReservationDto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class PaymentCalculatorFacadeTest {


    @Test
    public void ShouldReturnCorrectTotalCostForFiveHours(){
        //given

        LocalDateTime startDate = LocalDateTime.of(2024, 12, 12, 15, 0);
        LocalDateTime endDate = LocalDateTime.of(2024, 12, 12, 20, 16);
        ReservationDto reservation = new ReservationDto((UUID.randomUUID()), null, null, startDate, endDate, BigDecimal.ZERO);
        //when

    }
}
