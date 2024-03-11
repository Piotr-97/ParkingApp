package s18746.parking.parkingreservation.dto;

import lombok.Value;
import s18746.parking.parkingreservation.entities.Client;

import java.io.Serializable;
import java.util.UUID;

/**
 * DTO for {@link Client}
 */

public record ClientDto(UUID clientUniqueId, String firstname, String lastname) implements Serializable {
}
