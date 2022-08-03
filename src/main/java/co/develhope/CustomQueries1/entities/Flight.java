package co.develhope.CustomQueries1.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table
public class Flight {
    /**
     * a primary key
     * a string description
     * a string fromAirport
     * a string toAirport
     * an enum status
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String description;
    private String fromAirport;
    private String toAirport;
    private FlightStatus flightStatus;

    public Flight(String description, String from, String to){
        this.description=description;
        this.fromAirport=from;
        this.toAirport=to;
        this.flightStatus=FlightStatus.ONTIME;
    }

}
