package com.stayease.bookingapp.bookingapp.service;

import com.stayease.bookingapp.bookingapp.dto.ProfileUpdateRequestDto;
import com.stayease.bookingapp.bookingapp.dto.RoomDto;
import com.stayease.bookingapp.bookingapp.dto.UserDto;
import com.stayease.bookingapp.bookingapp.entity.User;

import java.util.List;

public interface UserService {
    User getUserById(Long id);

    void updateProfile(ProfileUpdateRequestDto profileUpdateRequestDto);

    UserDto getMyProfile();
}

