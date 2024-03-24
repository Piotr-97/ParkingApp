package s18746.parking.parkingreservation;

import s18746.parking.parkingreservation.dto.ParkingSpaceDto;
import s18746.parking.parkingreservation.dto.ReservationDto;
import s18746.parking.parkingreservation.entities.ParkingSpace;
import s18746.parking.parkingreservation.entities.Status;
import s18746.parking.parkingreservation.repositories.ParkingSpaceRepository;

import java.util.List;
import java.util.stream.Collectors;


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


    public ReservationDto reserveParkingSpot(String clientUUID, String parkingSpotNumber){
        

        return null;
    }


    public Boolean reservePlace(){

        return null;
    }

    public Boolean freeUpPlace(){
        return null;
    }


    public List<ParkingSpaceDto> getAllParkingSpaces(){
        List<ParkingSpace> parkingSpaces = parkingSpaceRepository.findAll();
        return parkingSpaces.stream().map(this::mapToDto).collect(Collectors.toList());
    }

    public List<ParkingSpaceDto> getAllFreeParkingSpaces() {
        List<ParkingSpace> parkingSpaces = parkingSpaceRepository.findParkingSpaceByStatus(Status.FREE);
        return parkingSpaces.stream().map(this::mapToDto).collect(Collectors.toList());
    }

    private ParkingSpaceDto mapToDto(ParkingSpace parkingSpace){
        return null;
    }

}
