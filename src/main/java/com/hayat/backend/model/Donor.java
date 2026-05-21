package com.hayat.backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "donors")
public class Donor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private Integer age;
    private String gender;
    private String phone; // Changed from contactNumber to match frontend key
    private String email;
    private String bloodGroup;
    private String city;
    private String area;
    private String address;
    private String availability;
    private Boolean pickAndDrop;
    private String lastDonation; // Handles null or string date format from front-end
    private Integer weight;
    
    @Column(length = 1000)
    private String diseases;
    
    private Boolean consent;
    private String status = "pending"; // Default registration status state

    // Default Constructor
    public Donor() {}

    // Overloaded Constructor
    public Donor(String name, Integer age, String gender, String phone, String email, String bloodGroup, 
                 String city, String area, String address, String availability, Boolean pickAndDrop, 
                 String lastDonation, Integer weight, String diseases, Boolean consent, String status) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
        this.bloodGroup = bloodGroup;
        this.city = city;
        this.area = area;
        this.address = address;
        this.availability = availability;
        this.pickAndDrop = pickAndDrop;
        this.lastDonation = lastDonation;
        this.weight = weight;
        this.diseases = diseases;
        this.consent = consent;
        this.status = status;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getBloodGroup() { return bloodGroup; }
    public void setBloodGroup(String bloodGroup) { this.bloodGroup = bloodGroup; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getArea() { return area; }
    public void setArea(String area) { this.area = area; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getAvailability() { return availability; }
    public void setAvailability(String availability) { this.availability = availability; }

    public Boolean getPickAndDrop() { return pickAndDrop; }
    public void setPickAndDrop(Boolean pickAndDrop) { this.pickAndDrop = pickAndDrop; }

    public String getLastDonation() { return lastDonation; }
    public void setLastDonation(String lastDonation) { this.lastDonation = lastDonation; }

    public Integer getWeight() { return weight; }
    public void setWeight(Integer weight) { this.weight = weight; }

    public String getDiseases() { return diseases; }
    public void setDiseases(String diseases) { this.diseases = diseases; }

    public Boolean getConsent() { return consent; }
    public void setConsent(Boolean consent) { this.consent = consent; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}