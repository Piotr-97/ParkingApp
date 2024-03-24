package s18746.parking.parkingreservation;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import s18746.parking.parkingreservation.repositories.ParkingSpaceRepository;

@SpringBootTest
public class ParkingReservationFacadeTest {



    @Test
    public void shouldReturnListOfFreeParkingSpaces(){
        ParkingSpaceFreer parkingSpaceFreer = new ParkingSpaceFreer();
        ParkingSpaceReserver parkingSpaceReserver = new ParkingSpaceReserver();
        ReservationCreator reservationCreator = new ReservationCreator();
        ParkingSpaceRepository parkingSpaceRepository = null;
        ParkingReservationFacade parkingReservationFacade = new ParkingReservationFacadeConfig()
                .parkingReservationFacadeForTest(parkingSpaceReserver,parkingSpaceFreer,parkingSpaceRepository,reservationCreator);

    }


    @Test
    public void shouldReturnParkingSpaceWithGivenId(){

    }


}
