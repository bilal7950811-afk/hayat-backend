package com.hayat.backend.controller;

import com.hayat.backend.model.Donor;
import com.hayat.backend.model.Acceptor;
import com.hayat.backend.repository.DonorRepository;
import com.hayat.backend.repository.AcceptorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/admin")
@CrossOrigin(origins = "*")
public class AdminController {

    @Autowired
    private DonorRepository donorRepository;

    @Autowired
    private AcceptorRepository acceptorRepository;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Map<String, String> payload) {
        String password = payload.get("password");
        if ("hayatadmin2026".equals(password)) {
            return ResponseEntity.ok(Map.of("token", "mock-valid-admin-token"));
        }
        return ResponseEntity.status(401).body("Invalid credentials");
    }

    @GetMapping("/donors")
    public List<Donor> getAllDonors() {
        return donorRepository.findAll();
    }

    @GetMapping("/acceptors")
    public List<Acceptor> getAllAcceptors() {
        return acceptorRepository.findAll();
    }

    @PutMapping("/donors/{id}/status")
    public ResponseEntity<Donor> updateDonorStatus(@PathVariable Long id, @RequestBody Map<String, String> payload) {
        String status = payload.get("status");
        return donorRepository.findById(id).map(donor -> {
            donor.setStatus(status);
            return ResponseEntity.ok(donorRepository.save(donor));
        }).orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/acceptors/{id}/status")
    public ResponseEntity<Acceptor> updateAcceptorStatus(@PathVariable Long id, @RequestBody Map<String, String> payload) {
        String status = payload.get("status");
        return acceptorRepository.findById(id).map(acceptor -> {
            acceptor.setStatus(status);
            return ResponseEntity.ok(acceptorRepository.save(acceptor));
        }).orElse(ResponseEntity.notFound().build());
    }
}