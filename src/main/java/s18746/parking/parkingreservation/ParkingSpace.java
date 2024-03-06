package s18746.parking.parkingreservation;


import jakarta.persistence.*;

import java.math.BigDecimal;


@Entity
public class ParkingSpace {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String parkingNumber;
    @Enumerated
    private ParkingSpaceType parkingSpaceType;
    private BigDecimal costPerHour;
    @Enumerated
    private Status status;
    private String localization;






}
