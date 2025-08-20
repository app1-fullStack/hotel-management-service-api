package com.hotel_management_system_api.repo;

import com.hotel_management_system_api.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepo extends JpaRepository<Room,String> {
}
