package com.hotel_service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel_service.entities.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, String> {

}
