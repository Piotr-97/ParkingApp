package s18746.parking.parkingspacetimecounter;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import s18746.parking.parkingreservation.entities.Reservation;

import java.time.LocalDateTime;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class ParkingSpaceTimeCounterFacadeTest {

    @Test
    public void shouldReturnPlusOneHourInDifferenceWhenNextHourIsStarted(){
        //given
        TimeCounter timeCounter = new TimeCounter();
        ParkingSpaceTimeCounterFacade parkingSpaceTimeCounterFacade = new ParkingSpaceTimeCounterConfiguration().parkingSpaceTimeCounterFacadeForTest(timeCounter);
        LocalDateTime startDate = LocalDateTime.of(2024, 12, 12, 15, 0);
        LocalDateTime endDate = LocalDateTime.of(2024, 12, 12, 20, 16);
        Reservation reservation = Reservation.builder()
                .reservationId(UUID.randomUUID())
                .parkingSpace(null)
                .reservationEnd(endDate)
                .reservationStart(startDate)
                .client(null)
                .id(1L)
                .build();

        //when
        Long hours = parkingSpaceTimeCounterFacade.calculateDifferencesBetweenDatesInReservation(reservation);

        //then
        assertEquals(6,hours);
    }

    @Test
    public void shouldReturnPlusOneHourInDifference(){
        //given
        TimeCounter timeCounter = new TimeCounter();
        ParkingSpaceTimeCounterFacade parkingSpaceTimeCounterFacade = new ParkingSpaceTimeCounterConfiguration().parkingSpaceTimeCounterFacadeForTest(timeCounter);
        LocalDateTime startDate = LocalDateTime.of(2024, 12, 12, 15, 0);
        LocalDateTime endDate = LocalDateTime.of(2024, 12, 12, 20, 0);
        Reservation reservation = Reservation.builder()
                .reservationId(UUID.randomUUID())
                .parkingSpace(null)
                .reservationEnd(endDate)
                .reservationStart(startDate)
                .client(null)
                .id(1L)
                .build();

        //when
        Long hours = parkingSpaceTimeCounterFacade.calculateDifferencesBetweenDatesInReservation(reservation);

        //then
        assertNotEquals(6,hours);
        assertEquals(5,hours);

    }

}
