package com.eduardotorrezh.challengebuenasnoches.dto.response;

import com.eduardotorrezh.challengebuenasnoches.dto.RoomTypeDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RoomRespDTO {

    private Long id;
    private String name;
    private String description;
    private int floor;
    private int maxGuests;
    private RoomTypeDTO roomType;

}
