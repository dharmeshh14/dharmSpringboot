package com.example.springboot.starting.springbootapplicationtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/rooms")
public class RoomController {
private RoomService roomservice;
@Autowired
public RoomController(RoomService roomservice){
    super();
    this.roomservice=roomservice;

}
    @GetMapping
    public String getAllRooms(Model model){
        model.addAttribute("rooms",this.roomservice.getAllRooms());
        return "rooms";
    }

}
