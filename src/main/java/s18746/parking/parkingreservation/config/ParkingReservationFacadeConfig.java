package s18746.parking.parkingreservation.config;

import org.springframework.context.annotation.Bean;
import s18746.parking.parkingreservation.ParkingReservationFacade;
import s18746.parking.parkingreservation.ParkingSpaceFreeer;
import s18746.parking.parkingreservation.ParkingSpaceReserver;

public class ParkingReservationFacadeConfig {


    @Bean
    public ParkingReservationFacade parkingReservationFacade(){
        ParkingSpaceReserver parkingSpaceReserver = new ParkingSpaceReserver();
        ParkingSpaceFreeer parkingSpaceFreeer = new ParkingSpaceFreeer();
        return new ParkingReservationFacade(parkingSpaceReserver,parkingSpaceFreeer);
    }

    public ParkingReservationFacade parkingReservationFacadeForTest(ParkingSpaceReserver parkingSpaceReserver, ParkingSpaceFreeer parkingSpaceFreeer) {
        return new ParkingReservationFacade(parkingSpaceReserver, parkingSpaceFreeer);
    }



}
