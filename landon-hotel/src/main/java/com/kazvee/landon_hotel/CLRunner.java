package com.kazvee.landon_hotel;

import com.kazvee.landon_hotel.data.repository.GuestRepository;
import com.kazvee.landon_hotel.data.repository.ReservationRepository;
import com.kazvee.landon_hotel.data.repository.RoomRepository;
import com.kazvee.landon_hotel.service.RoomReservationService;
import com.kazvee.landon_hotel.service.model.RoomReservation;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class CLRunner implements CommandLineRunner {

    private final RoomRepository roomRepository;
    private final GuestRepository guestRepository;
    private final ReservationRepository reservationRepository;
    private final RoomReservationService roomReservationService;

    public CLRunner(RoomRepository roomRepository, GuestRepository guestRepository,
            ReservationRepository reservationRepository, RoomReservationService roomReservationService) {
        this.roomRepository = roomRepository;
        this.guestRepository = guestRepository;
        this.reservationRepository = reservationRepository;
        this.roomReservationService = roomReservationService;
    }

    @Override
    public void run(String... args) throws Exception {
        List<RoomReservation> reservations = this.roomReservationService.getRoomReservationsForDate("2023-08-28");
        reservations.forEach(System.out::println);
    }
}
