package s18746.parking.parkingreservation.dto;

import lombok.Value;
import s18746.parking.parkingreservation.entities.Client;
import s18746.parking.parkingreservation.entities.Reservation;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * DTO for {@link Reservation}
 */

public record ReservationDto(UUID reservationId, ParkingSpaceDto parkingSpace,
                             ClientDto client,
                             LocalDateTime reservationStart, LocalDateTime reservationEnd,
                             BigDecimal totalCost) implements Serializable {
}