package s18746.parking.parkingspacetimecounter;

import s18746.parking.parkingreservation.entities.Reservation;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TimeCounter {

    public long calculateTimeDifferencesInReservation(LocalDateTime startDate, LocalDateTime endDate){
        long startedHours = 0;
        long hours = startDate.until(endDate, ChronoUnit.HOURS);
        long minutes = startDate.until(endDate, ChronoUnit.MINUTES) % 60;
        startedHours =  hours;
        if(minutes > 0){
            startedHours++;
        }
        return startedHours;
    }

}
