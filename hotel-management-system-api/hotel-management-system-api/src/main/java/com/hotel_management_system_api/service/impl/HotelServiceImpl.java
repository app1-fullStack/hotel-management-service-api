package com.hotel_management_system_api.service.impl;

import com.hotel_management_system_api.dto.request.RequestHotelDto;
import com.hotel_management_system_api.dto.response.ResponseHotelDto;
import com.hotel_management_system_api.dto.response.paginate.HotelPaginateResponseDto;
import com.hotel_management_system_api.entity.Hotel;
import com.hotel_management_system_api.service.HotelService;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Service
public class HotelServiceImpl implements HotelService {

    @Override
    public void create(RequestHotelDto dto) {

    }

    @Override
    public void update(RequestHotelDto dto, String hotelId) {

    }

    @Override
    public void delete(String hotelId) {

    }

    @Override
    public ResponseHotelDto findById(String hotelId) {
        return null;
    }

    @Override
    public HotelPaginateResponseDto findAll(int page, int size, String searchText) {
        return null;
        }


    //map structs, model mappers
    private Hotel toHotel(RequestHotelDto dto){
        return dto == null?null:
                Hotel.builder()
                        .hotelName(dto.getHotelName())
                        .hotelId(UUID.randomUUID().toString())
                        .starRating(dto.getStarRating())
                        .description(dto.getDescription())
                        .build();
    }
}
