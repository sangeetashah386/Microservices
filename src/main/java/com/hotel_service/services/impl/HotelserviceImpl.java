package com.hotel_service.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import com.hotel_service.entities.Hotel;
import com.hotel_service.exception.ResourceNotFoundException;
import com.hotel_service.repositories.HotelRepository;
import com.hotel_service.services.Hotelservices;

@Service
public class HotelserviceImpl implements Hotelservices{

	@Autowired
	private HotelRepository hotelRepository;
	
	@Override
	public Hotel create(Hotel hotel) {
		
		String hotelId= UUID.randomUUID().toString();
		hotel.setId(hotelId);
		
		return hotelRepository.save(hotel);
	}

	@Override
	public List<Hotel> getAll() {
		// TODO Auto-generated method stub
		return hotelRepository.findAll();
	}

	@Override
	public Hotel get(String id) {
		// TODO Auto-generated method stub
		return hotelRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Hotel with given id not found"));
	}
	


}
