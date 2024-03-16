package s18746.parking.parkingspacetimecounter;

import s18746.parking.parkingreservation.dto.ReservationDto;


import java.time.LocalDateTime;


public class ParkingSpaceTimeCounterFacade {

    private final TimeCounter timeCounter;

    public ParkingSpaceTimeCounterFacade(TimeCounter timeCounter) {
        this.timeCounter = timeCounter;
    }


    public Long calculateDifferencesBetweenDatesInReservation(ReservationDto reservationDto){
        LocalDateTime startDate = reservationDto.reservationStart();
        LocalDateTime endDate = reservationDto.reservationEnd();
        return timeCounter.calculateTimeDifferencesInReservation(startDate,endDate);
    }

}
