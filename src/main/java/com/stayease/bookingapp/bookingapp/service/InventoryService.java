package com.stayease.bookingapp.bookingapp.service;

import com.stayease.bookingapp.bookingapp.dto.HotelPriceResponseDto;
import com.stayease.bookingapp.bookingapp.dto.HotelSearchRequest;
import com.stayease.bookingapp.bookingapp.dto.InventoryDto;
import com.stayease.bookingapp.bookingapp.dto.UpdateInventoryRequestDto;
import com.stayease.bookingapp.bookingapp.entity.Room;
import org.springframework.data.domain.Page;

import java.util.List;

public interface InventoryService {
    void initializeRoomForAYear(Room room);

    void deleteAllInventories(Room room);

    Page<HotelPriceResponseDto> searchHotels(HotelSearchRequest hotelSearchRequest);

    List<InventoryDto> getAllInventoryByRoom(Long roomId);

    void updateInventory(Long roomId, UpdateInventoryRequestDto updateInventoryRequestDto);
}
