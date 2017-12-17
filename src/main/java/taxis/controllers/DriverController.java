package taxis.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import taxis.models.Driver;
import taxis.repositories.DriverRepository;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DriverController {
    @Autowired
    DriverRepository repository;

    @RequestMapping(value = "/taxis/drivers", method = RequestMethod.GET)
    public ResponseEntity<ArrayList<Driver>> readDrivers(@RequestParam("manager") int managerId) {
        ArrayList<Driver> drivers = (ArrayList<Driver>) repository.findByManagerId(managerId);
        return new ResponseEntity<>(drivers, HttpStatus.OK);
    }

    @RequestMapping(value = "/taxis/drivers", method = RequestMethod.POST)
    public ResponseEntity<Driver> createDriver(@RequestBody Driver driver) {
        Driver newDriver = repository.save(driver);
        return new ResponseEntity<>(newDriver, HttpStatus.OK);
    }

    @RequestMapping(value = "/taxis/drivers", method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteDriver(@RequestBody Driver driver) {
        repository.delete(driver.getId());
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
