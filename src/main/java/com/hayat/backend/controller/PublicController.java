package com.hayat.backend.controller;

import com.hayat.backend.model.Donor;
import com.hayat.backend.model.Acceptor;
import com.hayat.backend.repository.DonorRepository;
import com.hayat.backend.repository.AcceptorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api") // 👈 CHANGE THIS from "/api/public" to "/api"
public class PublicController {

    @Autowired
    private DonorRepository donorRepository;

    @Autowired
    private AcceptorRepository acceptorRepository;

    // Frontend will now correctly hit: http://localhost:8081/api/register-donor
    @PostMapping("/register-donor")
    public Donor registerDonor(@RequestBody Donor donor) {
        donor.setStatus("ACTIVE");
        return donorRepository.save(donor);
    }

    // Frontend will now correctly hit: http://localhost:8081/api/request-blood
    @PostMapping("/request-blood")
    public Acceptor requestBlood(@RequestBody Acceptor acceptor) {
        acceptor.setStatus("REQUESTED");
        return acceptorRepository.save(acceptor);
    }

    // Frontend will now correctly hit: http://localhost:8081/api/search-donors
    @GetMapping("/search-donors")
    public List<Donor> searchDonors(@RequestParam String bloodGroup, @RequestParam String city) {
        return donorRepository.findByBloodGroupAndCityAndStatus(bloodGroup, city, "ACTIVE");
    }
}