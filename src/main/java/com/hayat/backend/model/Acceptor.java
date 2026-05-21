package com.hayat.backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "acceptors")
public class Acceptor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String patientName;
    private Integer patientAge;
    private String attendantName;
    private String phone;
    private String email;
    private String bloodGroupNeeded;
    private Integer unitsNeeded;
    private String urgency;
    private String requiredBy;
    private String hospitalName;
    private String hospitalPhone;
    private String hospitalCity;
    private String hospitalArea;
    private String doctorName;
    
    @Lob
    @Column(columnDefinition = "TEXT")
    private String reason;
    
    private String status = "pending"; // Default state for incoming requests

    // Default Constructor
    public Acceptor() {}

    // Overloaded Constructor
    public Acceptor(String patientName, Integer patientAge, String attendantName, String phone, String email, 
                    String bloodGroupNeeded, Integer unitsNeeded, String urgency, String requiredBy, 
                    String hospitalName, String hospitalPhone, String hospitalCity, String hospitalArea, 
                    String doctorName, String reason, String status) {
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.attendantName = attendantName;
        this.phone = phone;
        this.email = email;
        this.bloodGroupNeeded = bloodGroupNeeded;
        this.unitsNeeded = unitsNeeded;
        this.urgency = urgency;
        this.requiredBy = requiredBy;
        this.hospitalName = hospitalName;
        this.hospitalPhone = hospitalPhone;
        this.hospitalCity = hospitalCity;
        this.hospitalArea = hospitalArea;
        this.doctorName = doctorName;
        this.reason = reason;
        this.status = status;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getPatientName() { return patientName; }
    public void setPatientName(String patientName) { this.patientName = patientName; }

    public Integer getPatientAge() { return patientAge; }
    public void setPatientAge(Integer patientAge) { this.patientAge = patientAge; }

    public String getAttendantName() { return attendantName; }
    public void setAttendantName(String attendantName) { this.attendantName = attendantName; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getBloodGroupNeeded() { return bloodGroupNeeded; }
    public void setBloodGroupNeeded(String bloodGroupNeeded) { this.bloodGroupNeeded = bloodGroupNeeded; }

    public Integer getUnitsNeeded() { return unitsNeeded; }
    public void setUnitsNeeded(Integer unitsNeeded) { this.unitsNeeded = unitsNeeded; }

    public String getUrgency() { return urgency; }
    public void setUrgency(String urgency) { this.urgency = urgency; }

    public String getRequiredBy() { return requiredBy; }
    public void setRequiredBy(String requiredBy) { this.requiredBy = requiredBy; }

    public String getHospitalName() { return hospitalName; }
    public void setHospitalName(String hospitalName) { this.hospitalName = hospitalName; }

    public String getHospitalPhone() { return hospitalPhone; }
    public void setHospitalPhone(String hospitalPhone) { this.hospitalPhone = hospitalPhone; }

    public String getHospitalCity() { return hospitalCity; }
    public void setHospitalCity(String hospitalCity) { this.hospitalCity = hospitalCity; }

    public String getHospitalArea() { return hospitalArea; }
    public void setHospitalArea(String hospitalArea) { this.hospitalArea = hospitalArea; }

    public String getDoctorName() { return doctorName; }
    public void setDoctorName(String doctorName) { this.doctorName = doctorName; }

    public String getReason() { return reason; }
    public void setReason(String reason) { this.reason = reason; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}