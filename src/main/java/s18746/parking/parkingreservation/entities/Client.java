package s18746.parking.parkingreservation.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "client")
public class Client {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String clientUniqueId;

    private String firstname;

    private String lastname;
    

}