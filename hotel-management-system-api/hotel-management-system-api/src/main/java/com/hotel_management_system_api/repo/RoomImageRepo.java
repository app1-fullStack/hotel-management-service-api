package com.hotel_management_system_api.repo;

import com.hotel_management_system_api.entity.RoomImage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomImageRepo extends JpaRepository<RoomImage,Long> {
}
