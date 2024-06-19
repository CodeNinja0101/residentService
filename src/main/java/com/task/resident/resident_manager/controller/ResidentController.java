package com.task.resident.resident_manager.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.task.resident.resident_manager.Service.ResidentService;
import com.task.resident.resident_manager.ServiceImpl.ResidentServiceImpl;
import com.task.resident.resident_manager.entity.ResidentEntity;
import com.task.resident.resident_manager.sharedException.DataNotFoundException;

import java.util.List;

@RestController
@RequestMapping("/resident")
public class ResidentController {

	@Autowired
	private ResidentService residentService;
	
	 private static final Logger logger = LoggerFactory.getLogger(ResidentServiceImpl.class);

	@PostMapping
	public ResidentEntity createResident(@RequestBody ResidentEntity residentEntity) {
		logger.info("Creating new resident: {}", residentEntity.toString());
		return residentService.createResident(residentEntity);
	}

	@GetMapping
	public List<ResidentEntity> getAllResidents() {
		 logger.info("Getting all residents");
		return residentService.getAllResidents();
	}

	@GetMapping("/{id}")
	public ResidentEntity getResidentById(@PathVariable Integer id) {
		logger.info("Getting resident with Id: {}", id);
		return residentService.getResidentById(id);
	}

	@PutMapping("/{id}")
	public ResidentEntity updateResident(@PathVariable Integer id, @RequestBody ResidentEntity residentEntity) {
		logger.info("Updating resident with Id: {} , {}", id, residentEntity.toString());
		return residentService.updateResident(id, residentEntity);
	}

	@DeleteMapping("/{id}")
	public void deleteResident(@PathVariable Integer id) {
		logger.info("Deleting resident with Id: {}", id);
		residentService.deleteResident(id);
	}
}
