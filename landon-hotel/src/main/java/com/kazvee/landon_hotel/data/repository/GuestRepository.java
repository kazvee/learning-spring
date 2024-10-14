package com.kazvee.landon_hotel.data.repository;

import com.kazvee.landon_hotel.data.entity.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<Guest, Long> {

}
