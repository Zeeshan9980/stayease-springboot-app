package com.stayease.bookingapp.bookingapp.repository;


import com.stayease.bookingapp.bookingapp.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
