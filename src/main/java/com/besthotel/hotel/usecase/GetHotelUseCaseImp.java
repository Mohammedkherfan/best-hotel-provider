package com.besthotel.hotel.usecase;

import com.besthotel.hotel.exception.HotelException;
import com.besthotel.hotel.repository.HotelRepository;
import com.besthotel.hotel.request.BestHotelRequest;
import com.besthotel.hotel.response.BestHotelResponse;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;

public class GetHotelUseCaseImp implements GetHotelUseCase {

    private HotelRepository repository;

    public GetHotelUseCaseImp(HotelRepository repository) {
        this.repository = repository;
    }

    public Collection<BestHotelResponse> getHotels(BestHotelRequest request) {
        try {
            Collection<BestHotelResponse> hotels = new ArrayList<>();
            repository.getHotels(request).forEach(e -> {
                hotels.add(new BestHotelResponse(e.getHotelName(), e.getRate(), NumberFormat.getCurrencyInstance().format(e.getFarePerNight()), e.getCity()));
            });
            return hotels;
        }catch (Exception ex) {
            throw new HotelException(ex.getMessage());
        }
    }
}
