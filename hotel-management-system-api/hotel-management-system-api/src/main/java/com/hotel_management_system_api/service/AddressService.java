package com.hotel_management_system_api.service;

import com.hotel_management_system_api.dto.request.RequestAddressDto;
import com.hotel_management_system_api.dto.request.RequestBranchDto;
import com.hotel_management_system_api.dto.response.ResponseAddressDto;
import com.hotel_management_system_api.dto.response.ResponseBranchDto;
import com.hotel_management_system_api.dto.response.paginate.BranchPaginateResponseDto;

public interface AddressService {
    public void create(RequestAddressDto dto);
    public void update(RequestAddressDto dto, String addressId);
    public void delete(String addressId);
    public ResponseAddressDto findById(String addressId);
    public ResponseAddressDto findByBranchId(String branchId);
}
