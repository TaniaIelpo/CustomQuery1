package co.develhope.CustomQueries1.controllers;

import co.develhope.CustomQueries1.entities.Flight;
import co.develhope.CustomQueries1.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Tania Ielpo
 */

@RestController
@RequestMapping("/flights")
public class FlightController {
    @Autowired
    FlightService flightService;


    /**
     * for the provisioning of 50 flights
     */
    @PostMapping
    public void put50(){
        flightService.save();
    }

    /**
     * for retrieving all the flights in the db
     * @return a flight List
     */
    @GetMapping
    public List<Flight> getAll(){
        return flightService.getAll();
    }
}
