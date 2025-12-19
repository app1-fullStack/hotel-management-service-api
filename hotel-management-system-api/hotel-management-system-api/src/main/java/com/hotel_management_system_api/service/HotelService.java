package com.hotel_management_system_api.service;

import com.hotel_management_system_api.dto.request.RequestHotelDto;
import com.hotel_management_system_api.dto.response.ResponseHotelDto;
import com.hotel_management_system_api.dto.response.paginate.HotelPaginateResponseDto;
import org.apache.coyote.Request;

import java.sql.SQLException;
import java.util.List;

public interface HotelService {
    public void create(RequestHotelDto dto) throws SQLException;
    public void update(RequestHotelDto dto, String hotelId);
    public void delete(String hotelId);
    public ResponseHotelDto findById(String hotelId) throws SQLException;
    public HotelPaginateResponseDto findAll(int page, int size, String searchText);
}
