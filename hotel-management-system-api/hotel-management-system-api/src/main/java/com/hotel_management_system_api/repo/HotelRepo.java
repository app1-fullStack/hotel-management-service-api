package com.hotel_management_system_api.repo;

import com.hotel_management_system_api.entity.Hotel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface HotelRepo extends JpaRepository<Hotel,String> {

    @Query(value = "SELECT * FROM hotel WHERE hotel_name LIKE %?1% AND active_status = true", nativeQuery = true)
    Page<Hotel> searchHotels(String searchText, Pageable pageable);

    @Query(value = "SELECT COUNT(*) FROM hotel WHERE hotel_name LIKE %?1% AND active_status = true", nativeQuery = true)
    long countAllHotels(String searchText);

    @Query(value = "SELECT * FROM hotel WHERE hotel_name LIKE %?1% AND active_status = true", nativeQuery = true)
    Page<Hotel> searchAllHotels(String searchText, Pageable pageable);
}

