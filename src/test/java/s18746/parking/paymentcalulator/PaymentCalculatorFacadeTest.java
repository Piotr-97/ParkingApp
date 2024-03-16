package s18746.parking.paymentcalulator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import s18746.parking.parkingreservation.ParkingSpaceType;
import s18746.parking.parkingreservation.dto.ParkingSpaceDto;
import s18746.parking.parkingreservation.dto.ReservationDto;
import s18746.parking.parkingreservation.entities.Status;
import s18746.parking.parkingspacetimecounter.ParkingSpaceTimeCounterFacade;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class PaymentCalculatorFacadeTest {


    @Test
    public void ShouldReturnCorrectTotalCostForFiveHours(){
        //given

        LocalDateTime startDate = LocalDateTime.of(2024, 12, 12, 15, 0);
        LocalDateTime endDate = LocalDateTime.of(2024, 12, 12, 20, 16);
        PaymentConverter paymentConverter = new PaymentConverter();
        ParkingSpaceTimeCounterFacade parkingSpaceTimeCounterFacade = Mockito.mock(ParkingSpaceTimeCounterFacade.class);
        PaymentCalculatorFacade paymentCalculatorFacade = new PaymentCalculatorFacade(paymentConverter,parkingSpaceTimeCounterFacade);
        ParkingSpaceDto parkingSpaceDto = new ParkingSpaceDto("A01", ParkingSpaceType.CAR,BigDecimal.valueOf(10L), Status.FREE,"A");
        ReservationDto reservationDto = new ReservationDto(UUID.randomUUID(),parkingSpaceDto,null,startDate,endDate,null);
        Mockito.when(parkingSpaceTimeCounterFacade.calculateDifferencesBetweenDatesInReservation(reservationDto)).thenReturn(5L);
        //when
        BigDecimal totalCost = paymentCalculatorFacade.calculatePaymentForReservation(reservationDto);

        //then
        Assertions.assertEquals(50,totalCost.toBigInteger().longValue());
    }



}
