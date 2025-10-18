package com.stayease.bookingapp.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

@Controller
public class PageController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/rooms")
    public String rooms(Model model) {
        // Sample static data for now (you can fetch from DB later)
        List<Map<String, Object>> rooms = List.of(
                Map.of("name", "Deluxe Suite", "type", "AC", "price", 2500),
                Map.of("name", "Standard Room", "type", "Non-AC", "price", 1500)
        );
        model.addAttribute("rooms", rooms);
        return "rooms";
    }

    @GetMapping("/booking")
    public String booking() {
        return "booking";
    }
}
