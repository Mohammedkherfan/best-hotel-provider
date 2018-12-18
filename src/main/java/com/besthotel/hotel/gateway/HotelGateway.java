package com.besthotel.hotel.gateway;

import com.besthotel.hotel.request.BestHotelRequest;
import com.besthotel.hotel.response.BestHotelResponse;
import com.besthotel.hotel.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

public class HotelGateway {

    @Autowired
    private HotelService hotelService;

    public Collection<BestHotelResponse> getHotels(BestHotelRequest request) {
        return hotelService.getHotels(request);
    }
}
