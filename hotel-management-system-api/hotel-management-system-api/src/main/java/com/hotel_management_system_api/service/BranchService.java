package com.hotel_management_system_api.service;

import com.hotel_management_system_api.dto.request.RequestBranchDto;
import com.hotel_management_system_api.dto.request.RequestHotelDto;
import com.hotel_management_system_api.dto.response.ResponseBranchDto;
import com.hotel_management_system_api.dto.response.ResponseHotelDto;
import com.hotel_management_system_api.dto.response.paginate.BranchPaginateResponseDto;
import com.hotel_management_system_api.dto.response.paginate.HotelPaginateResponseDto;

public interface BranchService {
    public void create(RequestBranchDto dto);
    public void update(RequestBranchDto dto, String branchId);
    public void delete(String branchId);
    public ResponseBranchDto findById(String branchId);
    public BranchPaginateResponseDto findAll(int page, int size, String searchText);
    public BranchPaginateResponseDto findAllByHotelId(int page, int size,String hotelId, String searchText);
}
