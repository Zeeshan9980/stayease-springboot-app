package com.stayease.bookingapp.bookingapp.repository;

import com.stayease.bookingapp.bookingapp.dto.HotelPriceDto;
import com.stayease.bookingapp.bookingapp.entity.Hotel;
import com.stayease.bookingapp.bookingapp.entity.HotelMinPrice;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.Optional;

public interface HotelMinPriceRepository extends JpaRepository<HotelMinPrice, Long> {

    @Query("SELECT new com.stayease.bookingapp.bookingapp.dto.HotelPriceDto(i.hotel, AVG(i.price)) " +
            "FROM HotelMinPrice i " +
            "WHERE i.hotel.city = :city " +
            "AND i.date BETWEEN :startDate AND :endDate " +
            "AND i.hotel.active = true " +
            "GROUP BY i.hotel")
    Page<HotelPriceDto> findHotelsWithAvailableInventory(
            String city, LocalDate startDate, LocalDate endDate,
            Integer guests, Long roomId, Pageable pageable);


    Optional<HotelMinPrice> findByHotelAndDate(Hotel hotel, LocalDate date);
}