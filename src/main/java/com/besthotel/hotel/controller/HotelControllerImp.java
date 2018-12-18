package com.besthotel.hotel.controller;

import com.besthotel.hotel.exception.HotelException;
import com.besthotel.hotel.gateway.HotelGateway;
import com.besthotel.hotel.hateoas.Hypermedia;
import com.besthotel.hotel.request.BestHotelRequest;
import com.besthotel.hotel.response.BestHotelResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;

@RestController
@RequestMapping(value = "/bestHotel")
@Api(description = "Best hotel Application API (Get Hotel).")
public class HotelControllerImp implements HotelController {

    @Autowired
    private HotelGateway gateway;
    private Hypermedia hypermedia = new Hypermedia();

    @Override
    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/{fromDate}/{toDate}/{city}/{numberOfAdults}", produces = {"application/hal+json"})
    @CrossOrigin()
    @ApiOperation(value = "Method to list hotels.", notes = "This method used when you want to list hotels.")
    public Collection<Resource<BestHotelResponse>> getHotels(@PathVariable String fromDate, @PathVariable String toDate, @PathVariable String city, @PathVariable Integer numberOfAdults) {
        try {
            Collection<Resource<BestHotelResponse>> resources = new ArrayList<>();
            gateway.getHotels(new BestHotelRequest(fromDate, toDate, city, numberOfAdults)).forEach(e -> {
                resources.add(hypermedia.getAccountResources(e));
            });
            return resources;
        }catch (Exception ex) {
            throw new HotelException(ex.getMessage());
        }
    }
}
