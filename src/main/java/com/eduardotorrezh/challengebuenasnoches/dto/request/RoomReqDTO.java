package com.eduardotorrezh.challengebuenasnoches.dto.request;

import com.eduardotorrezh.challengebuenasnoches.dto.RoomTypeDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RoomReqDTO {

    private Long id;
    private String description;
    private int floor;
    private RoomTypeDTO roomType;

}
