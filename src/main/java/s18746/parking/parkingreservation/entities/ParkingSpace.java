package s18746.parking.parkingreservation.entities;

import java.util.Set;
import jakarta.persistence.*;
import s18746.parking.parkingreservation.ParkingSpaceType;


import java.math.BigDecimal;


@Entity
@Table(name = "parkingspace")
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
    @OneToMany(mappedBy = "parkingSpace")
    private Set<Reservation> reservations;






}
