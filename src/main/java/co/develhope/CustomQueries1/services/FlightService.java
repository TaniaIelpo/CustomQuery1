package co.develhope.CustomQueries1.services;

import co.develhope.CustomQueries1.entities.Flight;
import co.develhope.CustomQueries1.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

/**
 * @author Tania Ielpo
 */

@Service
public class FlightService {

    @Autowired
    FlightRepository flightRepository;

    /**
     * all the string values are randomly generated (using random.ints())
     * the default status is ON_TIME
     */

    public void save(){
        for (int i = 0; i < 50; i++) {
            Flight flight=new Flight(generateString(),generateString(),generateString());
            flightRepository.saveAndFlush(flight);
        }

    }

    /**
     * Generates a random alphabetic String with 10 characters
     * @return a random String
     */

    private String generateString(){
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        return generatedString;
    }

    /**
     * Get all flight in datatbase
     * @return a flight List
     */

    public List<Flight> getAll() {
        return flightRepository.findAll();
    }


}
