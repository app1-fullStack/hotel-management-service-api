package com.hotel_management_system_api.api;

import com.hotel_management_system_api.dto.request.RequestHotelDto;
import com.hotel_management_system_api.service.HotelService;
import com.hotel_management_system_api.util.StandardResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

@RestController
@RequestMapping("/hotel-management/api/v1/hotels")
public class HotelController {
    private final HotelService hotelService;
    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @PostMapping("/user/create")
    public ResponseEntity<StandardResponseDto> create(
            @RequestBody RequestHotelDto dto) throws SQLException {
        hotelService.create(dto);
        return new ResponseEntity<> (
                new StandardResponseDto(201,
                        "Hotel created successfully",
                        null),HttpStatus.CREATED);
    }

    @PutMapping("/admin/update/{id}")
    public ResponseEntity<StandardResponseDto> update(
            @PathVariable("id") String hotelId,
            @RequestBody RequestHotelDto dto) throws SQLException {
        hotelService.update(dto, hotelId);
        return new ResponseEntity<> (
                new StandardResponseDto(201,
                        "Hotel Updated successfully",
                        null),HttpStatus.CREATED);
    }

    @DeleteMapping("/host/delete/{id}")
    public ResponseEntity<StandardResponseDto> delete(
            @PathVariable("id") String hotelId) throws SQLException {
        hotelService.delete(hotelId);
        return new ResponseEntity<> (
                new StandardResponseDto(204,
                        "Hotel Deleted successfully",
                        null),HttpStatus.NO_CONTENT);
    }

    @GetMapping("/visitor/find-by-id/{id}")
    public ResponseEntity<StandardResponseDto> findById(
            @PathVariable("id") String hotelId) throws SQLException {
        return new ResponseEntity<> (
                new StandardResponseDto(200,
                        "Hotel found successfully",
                        null),HttpStatus.OK);
    }
}
