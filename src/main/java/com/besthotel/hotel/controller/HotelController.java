package com.besthotel.hotel.controller;

import com.besthotel.hotel.response.BestHotelResponse;
import org.springframework.hateoas.Resource;

import java.util.Collection;

public interface HotelController {

    Collection<Resource<BestHotelResponse>> getHotels(String fromDate, String toDate, String city, Integer numberOfAdults);
}
