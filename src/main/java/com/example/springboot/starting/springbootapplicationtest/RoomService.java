package com.example.springboot.starting.springbootapplicationtest;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomService {
    private RoomRepository roomRepository;
    public RoomService(RoomRepository roomRepository){
        super();
        this.roomRepository=roomRepository;
    }

    public List<Room> getAllRooms(){
        List<Room> rooms=new ArrayList<>();
        this.roomRepository.findAll().forEach(rooms::add);
        return rooms;
    }
}
