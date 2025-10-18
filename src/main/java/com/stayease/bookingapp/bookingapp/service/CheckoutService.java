package com.stayease.bookingapp.bookingapp.service;

import com.stayease.bookingapp.bookingapp.entity.Booking;

public interface CheckoutService {
    String getCheckoutSession(Booking booking, String successUrl, String failureUrl);

}
