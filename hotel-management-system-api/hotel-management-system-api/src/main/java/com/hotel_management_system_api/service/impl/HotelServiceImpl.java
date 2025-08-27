package com.hotel_management_system_api.service.impl;

import com.hotel_management_system_api.dto.request.RequestHotelDto;
import com.hotel_management_system_api.dto.response.ResponseHotelDto;
import com.hotel_management_system_api.dto.response.paginate.HotelPaginateResponseDto;
import com.hotel_management_system_api.entity.Hotel;
import com.hotel_management_system_api.repo.HotelRepo;
import com.hotel_management_system_api.service.HotelService;
import lombok.*;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class HotelServiceImpl implements HotelService {
    @Override
    public void create(RequestHotelDto dto) {

        private final HotelRepo hotelRepo;
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

        private Hotel toHotel(RequestHotelDto dto) {
            return dto==null?null:
                    Hotel
        }
    }
}
