package taxis.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import taxis.repositories.CarRepository;

@RestController
public class CarController {
    @Autowired
    CarRepository repository;
}
