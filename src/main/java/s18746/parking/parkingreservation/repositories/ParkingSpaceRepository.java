package s18746.parking.parkingreservation.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import s18746.parking.parkingreservation.entities.ParkingSpace;
import s18746.parking.parkingreservation.entities.Status;

import java.util.List;

@Repository
public interface ParkingSpaceRepository extends JpaRepository<ParkingSpace,Long> {

    public List<ParkingSpace> findParkingSpaceByStatus(Status status);
}
