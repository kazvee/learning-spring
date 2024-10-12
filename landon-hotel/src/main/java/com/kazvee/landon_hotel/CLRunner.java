package com.kazvee.landon_hotel;

import org.springframework.stereotype.Component;

import com.kazvee.landon_hotel.data.entity.Room;
import com.kazvee.landon_hotel.data.repository.RoomRepository;
import org.springframework.boot.CommandLineRunner;
import java.util.List;
import java.util.Optional;

@Component
public class CLRunner implements CommandLineRunner {

    private final RoomRepository roomRepository;

    public CLRunner(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        List<Room> rooms = roomRepository.findAll();
        Optional<Room> room = roomRepository.findByRoomNumberIgnoreCase("p1");
        System.out.println(room);
        rooms.forEach(System.out::println);
    }
}
