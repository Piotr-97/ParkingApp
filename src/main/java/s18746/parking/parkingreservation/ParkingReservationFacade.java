package s18746.parking.parkingreservation;


import s18746.parking.parkingreservation.dto.ClientDto;
import s18746.parking.parkingreservation.dto.ParkingSpaceDto;
import s18746.parking.parkingreservation.repositories.ParkingSpaceRepository;


public class ParkingReservationFacade {

    private final ParkingSpaceReserver parkingSpaceReserver;
    private final ParkingSpaceFreer parkingSpaceFreer;
    private final ParkingSpaceRepository parkingSpaceRepository;
    public final ReservationCreator reservationCreator;

    public ParkingReservationFacade(ParkingSpaceReserver parkingSpaceReserver, ParkingSpaceFreer parkingSpaceFreer, ParkingSpaceRepository parkingSpaceRepository, ReservationCreator reservationCreator) {
        this.parkingSpaceReserver = parkingSpaceReserver;
        this.parkingSpaceFreer = parkingSpaceFreer;
        this.parkingSpaceRepository = parkingSpaceRepository;
        this.reservationCreator = reservationCreator;
    }

    public void reserveParkingSpot(ClientDto clientDto, ParkingSpaceDto parkingSpaceDto){

    }


    public Boolean reservePlace(){

        return null;
    }

    public Boolean freeUpPlace(){
        return null;
    }


}
