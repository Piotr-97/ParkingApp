package s18746.parking.parkingspacetimecounter;


import org.junit.jupiter.api.Test;
import s18746.parking.parkingreservation.dto.ReservationDto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class ParkingSpaceTimeCounterFacadeTest {

    @Test
    public void shouldReturnPlusOneHourInDifferenceWhenNextHourIsStarted() {
        //given
        TimeCounter timeCounter = new TimeCounter();
        ParkingSpaceTimeCounterFacade parkingSpaceTimeCounterFacade = new ParkingSpaceTimeCounterConfiguration().parkingSpaceTimeCounterFacadeForTest(timeCounter);
        LocalDateTime startDate = LocalDateTime.of(2024, 12, 12, 15, 0);
        LocalDateTime endDate = LocalDateTime.of(2024, 12, 12, 20, 16);
        ReservationDto reservation = new ReservationDto((UUID.randomUUID()), null, null, startDate, endDate, BigDecimal.ZERO);
        //when
        Long hours = parkingSpaceTimeCounterFacade.calculateDifferencesBetweenDatesInReservation(reservation);

        //then
        assertEquals(6, hours);
    }

    @Test
    public void shouldReturnDifferenceHoursBetweenDates() {
        //given
        TimeCounter timeCounter = new TimeCounter();
        ParkingSpaceTimeCounterFacade parkingSpaceTimeCounterFacade = new ParkingSpaceTimeCounterConfiguration().parkingSpaceTimeCounterFacadeForTest(timeCounter);
        LocalDateTime startDate = LocalDateTime.of(2024, 12, 12, 15, 0);
        LocalDateTime endDate = LocalDateTime.of(2024, 12, 12, 20, 0);
        ReservationDto reservation = new ReservationDto((UUID.randomUUID()), null, null, startDate, endDate, BigDecimal.ZERO);

        //when
        Long hours = parkingSpaceTimeCounterFacade.calculateDifferencesBetweenDatesInReservation(reservation);

        //then
        assertNotEquals(6, hours);
        assertEquals(5, hours);
    }


}
