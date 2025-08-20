package com.hotel_management_system_api.repo;

import com.hotel_management_system_api.entity.Facility;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacilityRepo extends JpaRepository<Facility,Long> {
}
