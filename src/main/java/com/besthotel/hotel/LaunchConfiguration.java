package com.besthotel.hotel;

import com.besthotel.hotel.gateway.HotelGateway;
import com.besthotel.hotel.repository.HotelRepository;
import com.besthotel.hotel.repository.HotelRepositoryImp;
import com.besthotel.hotel.service.HotelService;
import com.besthotel.hotel.service.HotelServiceImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LaunchConfiguration {

    @Bean
    public HotelService getHotelService() {
        return new HotelServiceImp(getHotelRepository());
    }

    @Bean
    public HotelRepository getHotelRepository() {
        return new HotelRepositoryImp();
    }

    @Bean
    public HotelGateway getHotelGateway() {
        return new HotelGateway();
    }
}
