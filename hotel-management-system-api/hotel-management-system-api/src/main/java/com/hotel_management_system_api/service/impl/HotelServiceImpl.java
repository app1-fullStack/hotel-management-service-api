package com.hotel_management_system_api.service.impl;

import com.hotel_management_system_api.dto.request.RequestHotelDto;
import com.hotel_management_system_api.dto.response.ResponseHotelDto;
import com.hotel_management_system_api.dto.response.paginate.HotelPaginateResponseDto;
import com.hotel_management_system_api.entity.Hotel;
import com.hotel_management_system_api.repo.HotelRepo;
import com.hotel_management_system_api.service.HotelService;
import com.hotel_management_system_api.util.ByteCodeHandler;
import com.hotel_management_system_api.util.ByteCodeHandlerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.UUID;


@Service
@RequiredArgsConstructor
public class HotelServiceImpl implements HotelService {

    private final HotelRepo hotelRepo;
    private final ByteCodeHandler byteCodeHandler;

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
    private Hotel toHotel(RequestHotelDto dto) throws SQLException {
        return dto == null?null:
                Hotel.builder()
                        .hotelName(dto.getHotelName())
                        .hotelId(UUID.randomUUID().toString())
                        .starRating(dto.getStarRating())
                        .description(byteCodeHandler.stringToBlob(dto.getDescription()))
                        .createdAt(LocalDateTime.now())
                        .updatedAt(LocalDateTime.now())
                        .activeStatus(true)
                        .startingFrom(dto.getStartingFrom())
                        .build();
    }

    private ResponseHotelDto toResponseHotelDto(Hotel hotel) throws SQLException {
        return hotel == null?null:
                Hotel.builder()
                        .hotelId(hotel.getHotelId())
                        .hotelName(hotel.getHotelName())
                        .activeStatus(hotel.isActiveStatus())
                        .startingFrom(hotel.getStartingFrom())
                        .updatedAt(LocalDateTime.now())
                        .createdAt(LocalDateTime.now())
                        .description(hotel.getDescription())
                        .branches()
                        .build();
    }
}
