package com.task.resident.resident_manager.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.resident.resident_manager.Service.ResidentService;
import com.task.resident.resident_manager.entity.ResidentEntity;
import com.task.resident.resident_manager.repository.ResidentRepository;
import com.task.resident.resident_manager.sharedException.DataNotFoundException;

@Service
public class ResidentServiceImpl implements ResidentService {

	@Autowired
	private ResidentRepository residentRepository;
	
    private static final Logger logger = LoggerFactory.getLogger(ResidentServiceImpl.class);

	@Override
	public ResidentEntity createResident(ResidentEntity residentEntity) {
		logger.info("Creating new resident: {}", residentEntity);
		return residentRepository.save(residentEntity);
	}

	@Override
	public List<ResidentEntity> getAllResidents() {
		 logger.info("Get all residents");
		return residentRepository.findAll();
	}
	
	@Override
	public ResidentEntity getResidentById(Integer id) {
	    logger.info("Get resident with Id: {}", id);
	    Optional<ResidentEntity> residentEntityOptional = residentRepository.findById(id);
	    	    return residentEntityOptional.orElseThrow(() -> new DataNotFoundException("Resident not found with Id: " + id));
	}
	

	@Override
	public ResidentEntity updateResident(Integer id, ResidentEntity residentEntity) {
		logger.info("Updating resident with Id: {}", id);
		if (residentRepository.existsById(id)) {
			residentEntity.setId(id);
			return residentRepository.save(residentEntity);
		}else {
			throw new DataNotFoundException("No Resident with Id: "+ id);
		}
	}

	@Override
	public void deleteResident(Integer id) {
		logger.info("Deleting resident with Id: {}", id);
		residentRepository.deleteById(id);
	}
}
