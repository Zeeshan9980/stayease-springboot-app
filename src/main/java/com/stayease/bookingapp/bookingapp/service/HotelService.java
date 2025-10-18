package com.stayease.bookingapp.bookingapp.service;

import com.stayease.bookingapp.bookingapp.dto.HotelDto;
import com.stayease.bookingapp.bookingapp.dto.HotelInfoDto;
import com.stayease.bookingapp.bookingapp.dto.HotelInfoRequestDto;

import java.util.List;

public interface HotelService {
    HotelDto createNewHotel(HotelDto hotelDto);

    HotelDto getHotelById(Long id);

    HotelDto updateHotelById(Long id, HotelDto hotelDto);

    void deleteHotelById(Long id);

    void activateHotel(Long hotelId);

    HotelInfoDto getHotelInfoById(Long hotelId, HotelInfoRequestDto hotelInfoRequestDto);

    List<HotelDto> getAllHotels();
}
