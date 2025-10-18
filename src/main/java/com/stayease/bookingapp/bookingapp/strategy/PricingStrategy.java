package com.stayease.bookingapp.bookingapp.strategy;

import com.stayease.bookingapp.bookingapp.entity.Inventory;

import java.math.BigDecimal;

public interface PricingStrategy {
    BigDecimal calculatePrice(Inventory inventory);
}
