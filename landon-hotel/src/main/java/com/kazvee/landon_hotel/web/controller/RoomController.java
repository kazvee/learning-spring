package com.kazvee.landon_hotel.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.kazvee.landon_hotel.data.repository.RoomRepository;

@Controller
@RequestMapping("/rooms")
public class RoomController {

    private final RoomRepository roomRepository;

    public RoomController(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @GetMapping
    public String getRooms(Model model) {
        model.addAttribute("rooms", this.roomRepository.findAll());
        return "room-list";
    }
}