package com.eduardotorrezh.challengebuenasnoches.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RoomDTO {

    private Long id;
    private String name;
    private String description;
    private int floor;
    private int maxGuests;
    private RoomTypeDTO roomType;
    private HotelDTO hotel;

}
