package com.besthotel.hotel.hateoas;

import com.besthotel.hotel.controller.HotelControllerImp;
import com.besthotel.hotel.response.BestHotelResponse;
import org.springframework.hateoas.Resource;

import static java.util.Objects.isNull;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

public class Hypermedia {

    public Resource getAccountResources(BestHotelResponse response) {
        Resource resource = null;
        if (!isNull(response)) {
            resource = new Resource(response);
            resource.add(linkTo(methodOn(HotelControllerImp.class).getHotels("", "", "", 0)).withSelfRel().withType("GET"));
            resource = new Resource(response);
            return resource;
        }
        return new Resource(new BestHotelResponse());
    }
}
