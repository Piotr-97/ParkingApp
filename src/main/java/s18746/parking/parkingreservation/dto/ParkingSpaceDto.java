package s18746.parking.parkingreservation.dto;

import lombok.Value;
import s18746.parking.parkingreservation.ParkingSpaceType;
import s18746.parking.parkingreservation.entities.ParkingSpace;
import s18746.parking.parkingreservation.entities.Status;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * DTO for {@link ParkingSpace}
 */
@Value
public class ParkingSpaceDto implements Serializable {
    String parkingNumber;
    ParkingSpaceType parkingSpaceType;
    BigDecimal costPerHour;
    Status status;
    String localization;
}