package s18746.parking.parkingreservation;


import lombok.AllArgsConstructor;
import s18746.parking.availablecheker.AvailableCheckerFacade;

@AllArgsConstructor
public class ParkingReservationFacade {

    private final ParkingSpaceReserver parkingSpaceReserver;
    private final ParkingSpaceFreeer parkingSpaceFreeer;
    private final AvailableCheckerFacade availableCheckerFacade;

    public Boolean reservePlace(){

        return null;
    }

    public Boolean freeUpPlace(){
        return null;
    }



}
