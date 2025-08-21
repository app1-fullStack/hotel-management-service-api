package com.hotel_management_system_api.service;

import com.hotel_management_system_api.dto.request.RequestHotelDto;
import com.hotel_management_system_api.dto.request.RequestRoomImageDto;
import com.hotel_management_system_api.dto.response.ResponseHotelDto;
import com.hotel_management_system_api.dto.response.ResponseRoomImageDto;
import com.hotel_management_system_api.dto.response.paginate.HotelPaginateResponseDto;
import com.hotel_management_system_api.dto.response.paginate.RoomImagePaginateResponseDto;

public interface RoomImageService {
    public void create(RequestRoomImageDto dto);
    public void update(RequestRoomImageDto dto, String imageId);
    public void delete(String imageId);
    public ResponseRoomImageDto findById(String imageId);
    public RoomImagePaginateResponseDto findAll(int page, int size, String roomId);
}
