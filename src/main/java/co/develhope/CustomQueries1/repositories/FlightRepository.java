package co.develhope.CustomQueries1.repositories;

import co.develhope.CustomQueries1.entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Tania Ielpo
 */

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
}
