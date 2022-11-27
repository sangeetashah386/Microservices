package com.hotel_service.services;

import java.util.List;

import com.hotel_service.entities.Hotel;

public interface Hotelservices {
	
	//create
	Hotel create(Hotel hotel);
	
	
	//getall
	List<Hotel> getAll();
	
	
	
	//getsingle
	Hotel get(String id);

}
