package s18746.parking.parkingreservation;

import s18746.parking.parkingreservation.entities.Reservation;

public class ReservationCreator {




    public Reservation createReservation(){
        return Reservation.builder().build();
    }
}
