package com.hayat.backend.repository;

import com.hayat.backend.model.Donor;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface DonorRepository extends JpaRepository<Donor, Long> {
    List<Donor> findByBloodGroupAndCityAndStatus(String bloodGroup, String city, String status);
}