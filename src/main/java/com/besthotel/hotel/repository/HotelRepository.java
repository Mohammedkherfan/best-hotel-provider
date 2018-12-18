package com.besthotel.hotel.repository;

import com.besthotel.hotel.model.Hotel;
import com.besthotel.hotel.request.BestHotelRequest;
import com.besthotel.hotel.response.BestHotelResponse;

import java.util.Collection;

public interface HotelRepository {

    Collection<Hotel> getHotels(BestHotelRequest request);
}
