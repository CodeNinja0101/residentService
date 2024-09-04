package com.task.resident.resident_manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.task.resident.resident_manager.entity.ResidentEntity;

public interface ResidentRepository extends JpaRepository<ResidentEntity, Integer> {

}
