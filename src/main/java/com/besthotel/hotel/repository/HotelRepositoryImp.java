package com.besthotel.hotel.repository;

import com.besthotel.hotel.model.Hotel;
import com.besthotel.hotel.request.BestHotelRequest;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class HotelRepositoryImp implements HotelRepository {

    private Collection<Hotel> collection = new ArrayList<>();

    public HotelRepositoryImp() {
        collection.add(new Hotel.Builder()
            .fromDate("2019-01-01")
            .toDate("2019-12-31")
            .city("AUH")
            .numberOfAdults(10)
            .hotelName("Marriott Hotel")
            .farePerNight(new BigDecimal(100.00))
            .amenities("Wifi,parking,TV")
            .rate(3.0f)
            .discount(0)
            .build()
        );

        collection.add(new Hotel.Builder()
                .fromDate("2019-01-01")
                .toDate("2019-12-31")
                .city("AUH")
                .numberOfAdults(10)
                .hotelName("Royal Hotel")
                .farePerNight(new BigDecimal(180.00))
                .amenities("Wifi,parking,TV,Smoking Room")
                .rate(4.5f)
                .discount(0)
                .build()
        );

        collection.add(new Hotel.Builder()
                .fromDate("2019-05-01")
                .toDate("2019-12-31")
                .city("AUH")
                .numberOfAdults(10)
                .hotelName("Four Seasons Resort Dubai")
                .farePerNight(new BigDecimal(150.00))
                .amenities("Wifi,parking")
                .rate(4.5f)
                .discount(0)
                .build()
        );

        collection.add(new Hotel.Builder()
                .fromDate("2019-01-01")
                .toDate("2019-12-31")
                .city("DXB")
                .numberOfAdults(10)
                .hotelName("Four Seasons Resort Dubai")
                .farePerNight(new BigDecimal(150.00))
                .amenities("Wifi,parking")
                .rate(4.5f)
                .discount(0)
                .build()
        );

        collection.add(new Hotel.Builder()
                .fromDate("2019-01-01")
                .toDate("2019-12-31")
                .city("DXB")
                .numberOfAdults(10)
                .hotelName("Jumeirah Beach Hotel")
                .farePerNight(new BigDecimal(350.00))
                .amenities("Wifi,parking")
                .rate(4.9f)
                .discount(0)
                .build()
        );

        collection.add(new Hotel.Builder()
                .fromDate("2019-03-01")
                .toDate("2019-12-31")
                .city("DXB")
                .numberOfAdults(10)
                .hotelName("Sheraton Grand Hotel")
                .farePerNight(new BigDecimal(250.00))
                .amenities("Wifi,parking")
                .rate(4.1f)
                .discount(0)
                .build()
        );

    }

    public Collection<Hotel> getHotels(BestHotelRequest request) {
        return  collection.stream().filter(
                (hotel -> LocalDate.parse(hotel.getFromDate()).isBefore(LocalDate.parse(request.getFromDate())) &&
                        LocalDate.parse(hotel.getToDate()).isAfter(LocalDate.parse(request.getToDate())) &&
                        hotel.getCity().equals(request.getCity()) &&
                        hotel.getNumberOfAdults() >= request.getNumberOfAdults())
        ).collect(Collectors.toList());

    }
}
