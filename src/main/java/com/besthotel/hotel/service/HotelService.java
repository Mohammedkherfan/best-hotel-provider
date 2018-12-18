package com.besthotel.hotel.service;

import com.besthotel.hotel.request.BestHotelRequest;
import com.besthotel.hotel.response.BestHotelResponse;

import java.util.Collection;

public interface HotelService {

    Collection<BestHotelResponse> getHotels(BestHotelRequest request);
}
