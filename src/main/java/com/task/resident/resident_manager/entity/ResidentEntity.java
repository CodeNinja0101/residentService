package com.task.resident.resident_manager.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ResidentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String state;
    private String gender;
    private String flatNumber;
    private String rentStatus;

    public ResidentEntity(Integer id, String name, String state, String gender, String flatNumber, String rentStatus) {
        super();
        this.id = id;
        this.name = name;
        this.state = state;
        this.gender = gender;
        this.flatNumber = flatNumber;
        this.rentStatus = rentStatus;
    }

    public ResidentEntity() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "ResidentEntity [id=" + id + ", name=" + name + ", state=" + state + ", gender=" + gender
                + ", flatNumber=" + flatNumber + ", rentStatus=" + rentStatus + "]";
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
    }

    public String getRentStatus() {
        return rentStatus;
    }

    public void setRentStatus(String rentStatus) {
        this.rentStatus = rentStatus;
    }
}
