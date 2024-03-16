package s18746.parking.parkingreservation;

import org.springframework.context.annotation.Bean;
import s18746.parking.parkingreservation.repositories.ParkingSpaceRepository;

public class ParkingReservationFacadeConfig {


    @Bean
    public ParkingReservationFacade parkingReservationFacade(ParkingSpaceRepository parkingSpaceRepository) {
        ParkingSpaceReserver parkingSpaceReserver = new ParkingSpaceReserver();
        ParkingSpaceFreer parkingSpaceFreer = new ParkingSpaceFreer();
        ReservationCreator reservationCreator = new ReservationCreator();

        return new ParkingReservationFacade(parkingSpaceReserver, parkingSpaceFreer, parkingSpaceRepository, reservationCreator);
    }

    public ParkingReservationFacade parkingReservationFacadeForTest(ParkingSpaceReserver parkingSpaceReserver, ParkingSpaceFreer parkingSpaceFreer, ParkingSpaceRepository parkingSpaceRepository, ReservationCreator reservationCreator) {
        return new ParkingReservationFacade(parkingSpaceReserver, parkingSpaceFreer, parkingSpaceRepository, reservationCreator);
    }


}
