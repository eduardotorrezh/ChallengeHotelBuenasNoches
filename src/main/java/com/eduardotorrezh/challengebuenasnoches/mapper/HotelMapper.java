package com.eduardotorrezh.challengebuenasnoches.mapper;

import com.eduardotorrezh.challengebuenasnoches.dto.HotelDTO;
import com.eduardotorrezh.challengebuenasnoches.entity.Hotel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class HotelMapper {

    public Hotel hotelDTOToHotel(HotelDTO hotelDTO){
        Hotel hotel = new Hotel();
        hotel.setId(hotelDTO.getId());
        hotel.setName(hotelDTO.getName());
        hotel.setDescription(hotelDTO.getDescription());
        hotel.setStars(hotelDTO.getStars());
        return hotel;
    }

    public HotelDTO hotelToHotelDTO (Hotel hotel){
        HotelDTO hotelDTO = HotelDTO.builder().id(hotel.getId())
                .name(hotel.getName())
                .description(hotel.getDescription())
                .stars(hotel.getStars())
                .build();
        return hotelDTO;
    }

    public List<HotelDTO> hotelListToHotelDTOList(List<Hotel> hotelList){
        List<HotelDTO> hotelDTOList = new ArrayList<>();
        hotelList.forEach((hotel) -> {
            hotelDTOList.add(hotelToHotelDTO(hotel));
        });
        return hotelDTOList;
    }

    public List<Hotel> hotelDTOListToHotelList(List<HotelDTO> hotelDTOList){
        List<Hotel> hotelList = new ArrayList<>();
        hotelDTOList.forEach((hotelDTO) -> {
            hotelList.add(hotelDTOToHotel(hotelDTO));
        });
        return hotelList;
    }

}
