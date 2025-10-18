package com.stayease.bookingapp.bookingapp.dto;

import com.stayease.bookingapp.bookingapp.entity.enums.Gender;
import lombok.Data;

import java.time.LocalDate;
@Data
public class ProfileUpdateRequestDto {
    private String name;
    private LocalDate dateOfBirth;
    private Gender gender;
}
