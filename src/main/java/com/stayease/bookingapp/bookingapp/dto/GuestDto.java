package com.stayease.bookingapp.bookingapp.dto;

import com.stayease.bookingapp.bookingapp.entity.enums.Gender;
import lombok.Data;

import java.time.LocalDate;
@Data
public class GuestDto {

    private Long id;
    private String name;
    private Gender gender;
    private LocalDate dateOfBirth;
}
