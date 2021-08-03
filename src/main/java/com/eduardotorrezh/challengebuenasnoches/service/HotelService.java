package com.eduardotorrezh.challengebuenasnoches.service;

import com.eduardotorrezh.challengebuenasnoches.dto.HotelDTO;

import java.util.List;

public interface HotelService {
    List<HotelDTO> allHotels();
    HotelDTO addHotel(HotelDTO hotelDTO);
    HotelDTO updateHotel (Long id, HotelDTO trainerDTO);
    void deleteHotel (long id);
    HotelDTO getHotelId(long id);
}
