package com.besthotel.hotel.response;

public class BestHotelResponse {

    private String hotel;
    private Float hotelRate;
    private String hotelFare;
    private String roomAmenities;

    public BestHotelResponse() {
    }

    public BestHotelResponse(String hotel, Float hotelRate, String hotelFare, String roomAmenities) {
        this.hotel = hotel;
        this.hotelRate = hotelRate;
        this.hotelFare = hotelFare;
        this.roomAmenities = roomAmenities;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public Float getHotelRate() {
        return hotelRate;
    }

    public void setHotelRate(Float hotelRate) {
        this.hotelRate = hotelRate;
    }

    public String getHotelFare() {
        return hotelFare;
    }

    public void setHotelFare(String hotelFare) {
        this.hotelFare = hotelFare;
    }

    public String getRoomAmenities() {
        return roomAmenities;
    }

    public void setRoomAmenities(String roomAmenities) {
        this.roomAmenities = roomAmenities;
    }
}
