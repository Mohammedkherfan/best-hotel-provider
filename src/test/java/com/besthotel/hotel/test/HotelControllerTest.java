package com.besthotel.hotel.test;

import com.besthotel.hotel.controller.HotelController;
import com.besthotel.hotel.gateway.HotelGateway;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(HotelController.class)
public class HotelControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private HotelGateway gateway;

    @Test
    public void whenGetListOfHotels_ThenShouldReturnListOfHotel() throws Exception {
        mockMvc.perform(get("/bestHotel/2018-12-30/2019-08-05/AUH/1")).andExpect(status().isOk());
    }

}
