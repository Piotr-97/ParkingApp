package s18746.parking.parkingspacetimecounter;

import lombok.AllArgsConstructor;
import s18746.parking.parkingreservation.entities.Reservation;


import java.time.LocalDateTime;


@AllArgsConstructor
public class ParkingSpaceTimeCounterFacade {

    private final TimeCounter timeCounter;


    public Long calculateDifferencesBetweenDatesInReservation(Reservation reservation){
        LocalDateTime startDate = reservation.getReservationStart();
        LocalDateTime endDate = reservation.getReservationEnd();
        return timeCounter.calculateTimeDifferencesInReservation(startDate,endDate);
    }


}
