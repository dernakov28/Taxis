package taxis.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import taxis.models.Driver;
import taxis.repositories.ManagerRepository;
import taxis.models.Manager;

import java.util.ArrayList;

@RestController
public class ManagerController {
    @Autowired
    ManagerRepository repository;

    @RequestMapping(value = "/taxis/managers", method = RequestMethod.GET)
    public ResponseEntity<ArrayList<Manager>> readManagers() {
        ArrayList<Manager> managers = (ArrayList<Manager>) repository.findAll();
        return new ResponseEntity<>(managers, HttpStatus.OK);
    }

    @RequestMapping(value = "/taxis/managers", method = RequestMethod.POST)
    public ResponseEntity<Manager> createManager(@RequestBody Manager manager) {
        Manager newManager = repository.save(manager);
        return new ResponseEntity(newManager, HttpStatus.OK);
    }

}
