package com.stayease.bookingapp.bookingapp.repository;

import com.stayease.bookingapp.bookingapp.entity.Guest;
import com.stayease.bookingapp.bookingapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GuestRepository extends JpaRepository<Guest, Long> {
    List<Guest> findByUser(User user);
}