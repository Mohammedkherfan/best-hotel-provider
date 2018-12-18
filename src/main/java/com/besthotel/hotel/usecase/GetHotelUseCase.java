package com.besthotel.hotel.usecase;

import com.besthotel.hotel.request.BestHotelRequest;
import com.besthotel.hotel.response.BestHotelResponse;

import java.util.Collection;

public interface GetHotelUseCase {

    Collection<BestHotelResponse> getHotels(BestHotelRequest request);
}
