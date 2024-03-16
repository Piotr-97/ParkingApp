package s18746.parking.paymentcalulator;

import org.springframework.cglib.core.Local;
import s18746.parking.parkingreservation.dto.ReservationDto;
import s18746.parking.parkingspacetimecounter.ParkingSpaceTimeCounterFacade;

import java.math.BigDecimal;
import java.time.LocalDateTime;


public class PaymentCalculatorFacade {

    private final PaymentConverter paymentConverter;

    private final ParkingSpaceTimeCounterFacade parkingSpaceTimeCounterFacade;

    public PaymentCalculatorFacade(PaymentConverter paymentConverter, ParkingSpaceTimeCounterFacade parkingSpaceTimeCounterFacade) {
        this.paymentConverter = paymentConverter;
        this.parkingSpaceTimeCounterFacade = parkingSpaceTimeCounterFacade;
    }


    public BigDecimal calculatePaymentForReservation(ReservationDto reservationDto){
        Long durationOfTheReservation = parkingSpaceTimeCounterFacade.calculateDifferencesBetweenDatesInReservation(reservationDto);
        return paymentConverter.calculateCost(durationOfTheReservation,reservationDto.parkingSpace().getCostPerHour());
    }




}
