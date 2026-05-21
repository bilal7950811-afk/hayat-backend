package com.hayat.backend.repository;

import com.hayat.backend.model.Acceptor;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AcceptorRepository extends JpaRepository<Acceptor, Long> {
    
    // Optional: Add this only if you want to search/filter requests by blood type, city, and status later!
    List<Acceptor> findByBloodGroupNeededAndHospitalCityAndStatus(String bloodGroupNeeded, String hospitalCity, String status);
}