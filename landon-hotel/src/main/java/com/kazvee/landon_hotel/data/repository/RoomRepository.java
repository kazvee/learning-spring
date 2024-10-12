package com.kazvee.landon_hotel.data.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kazvee.landon_hotel.data.entity.Room;

public interface RoomRepository extends JpaRepository<Room, Long> {
    Optional<Room> findByRoomNumberIgnoreCase(String roomNumber);

}
