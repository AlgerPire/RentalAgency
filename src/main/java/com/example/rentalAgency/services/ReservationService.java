package com.example.rentalAgency.services;


import com.example.rentalAgency.model.Reservation;

import java.util.List;

public interface ReservationService {

    Reservation addReservation(Reservation reservation);

    List<Reservation> listAll();

    Reservation updateReservation(Long id, Reservation reservation);

    Reservation findById(Long id);

    void deleteReservation(Long id);

}
