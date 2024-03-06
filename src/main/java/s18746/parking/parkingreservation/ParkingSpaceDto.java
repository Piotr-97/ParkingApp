package s18746.parking.parkingreservation;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * DTO for {@link ParkingSpace}
 */
public record ParkingSpaceDto(Long id, String parkingNumber, ParkingSpaceType parkingSpaceType,
                              BigDecimal costPerHour) implements Serializable {
}