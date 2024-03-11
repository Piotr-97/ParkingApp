package s18746.parking.paymentcalulator;

import lombok.AllArgsConstructor;
import s18746.parking.parkingreservation.dto.ReservationDto;
import s18746.parking.parkingspacetimecounter.ParkingSpaceTimeCounterFacade;

import java.math.BigDecimal;

@AllArgsConstructor
public class PaymentCalculatorFacade {

    private final PaymentConverter paymentConverter;

    private ParkingSpaceTimeCounterFacade parkingSpaceTimeCounterFacade;
    public BigDecimal calculatePaymentForReservation(ReservationDto reservationDto){
        Long durationOfTheReservation = parkingSpaceTimeCounterFacade.calculateDifferencesBetweenDatesInReservation(reservationDto);
        return paymentConverter.calculateCost(durationOfTheReservation,reservationDto.parkingSpace().getCostPerHour());

    }


}
