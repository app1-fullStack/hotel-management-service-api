package com.hotel_management_system_api.repo;

import com.hotel_management_system_api.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address,String> {
}
