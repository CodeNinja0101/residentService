package com.task.resident.resident_manager.Service;

import java.util.List;
import java.util.Map;

import com.task.resident.resident_manager.entity.ResidentEntity;

public interface ResidentService {

    ResidentEntity createResident(ResidentEntity residentEntity);

    ResidentEntity getResidentById(Integer id);

    List<ResidentEntity> getAllResidents();

    ResidentEntity updateResident(Integer id, ResidentEntity residentEntity);

    void deleteResident(Integer id);

    ResidentEntity patchResident(Integer id, Map<String, Object> updates);
}
