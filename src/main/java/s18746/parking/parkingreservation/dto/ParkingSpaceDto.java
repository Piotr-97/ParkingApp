package s18746.parking.parkingreservation.dto;

import s18746.parking.parkingreservation.entities.ParkingSpace;
import s18746.parking.parkingreservation.ParkingSpaceType;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * DTO for {@link ParkingSpace}
 */
public record ParkingSpaceDto(Long id, String parkingNumber, ParkingSpaceType parkingSpaceType,
                              BigDecimal costPerHour) implements Serializable {
}