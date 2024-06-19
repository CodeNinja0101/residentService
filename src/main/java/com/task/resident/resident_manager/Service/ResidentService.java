package com.task.resident.resident_manager.Service;

import java.util.List;

import com.task.resident.resident_manager.entity.ResidentEntity;

public interface ResidentService {

	ResidentEntity createResident(ResidentEntity residentEntity);

	ResidentEntity getResidentById(Integer id);

	List<ResidentEntity> getAllResidents();

	ResidentEntity updateResident(Integer id, ResidentEntity residentEntity);

	void deleteResident(Integer id);

}
