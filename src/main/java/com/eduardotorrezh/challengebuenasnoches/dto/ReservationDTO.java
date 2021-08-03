package com.eduardotorrezh.challengebuenasnoches.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ReservationDTO {

    private Long id;
    private GuestDTO guest;
    private RoomDTO room;
    private String startDate;
    private String endDate;
    private boolean checkIn;
    private boolean checkOut;

}
