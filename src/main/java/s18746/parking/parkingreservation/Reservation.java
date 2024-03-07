package s18746.parking.parkingreservation;


import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Reservation {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private UUID reservationId;

    @ManyToOne
    @JoinColumn(name="parkingspace_id", nullable=false)
    private ParkingSpace parkingSpace;




}
