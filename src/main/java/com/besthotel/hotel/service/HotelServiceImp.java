package com.besthotel.hotel.service;

import com.besthotel.hotel.repository.HotelRepository;
import com.besthotel.hotel.request.BestHotelRequest;
import com.besthotel.hotel.response.BestHotelResponse;
import com.besthotel.hotel.usecase.GetHotelUseCase;
import com.besthotel.hotel.usecase.GetHotelUseCaseImp;
import com.besthotel.hotel.validation.HotelValidation;

import java.util.Collection;

public class HotelServiceImp implements HotelService {

    private GetHotelUseCase getHotelUseCase;
    private HotelValidation validation = new HotelValidation();

    public HotelServiceImp(HotelRepository repository) {
        this.getHotelUseCase = new GetHotelUseCaseImp(repository);
    }

    public Collection<BestHotelResponse> getHotels(BestHotelRequest request) {
        validation.getHotelsRequestValidation(request);
        return getHotelUseCase.getHotels(request);
    }
}
