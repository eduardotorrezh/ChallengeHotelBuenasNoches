package com.eduardotorrezh.challengebuenasnoches.mapper;

import com.eduardotorrezh.challengebuenasnoches.dto.RoomTypeDTO;
import com.eduardotorrezh.challengebuenasnoches.entity.RoomType;
import org.springframework.stereotype.Component;

@Component
public class RoomTypeMapper {

    public RoomType RoomTypeDTOToRoomType(RoomTypeDTO roomTypeDTO){
        RoomType roomType = new RoomType();
        roomType.setId(roomTypeDTO.getId());
        roomType.setName(roomTypeDTO.getName());
        return roomType;
    }

    public RoomTypeDTO RoomTypeToRoomTypeDTO(RoomType roomType){
        RoomTypeDTO roomTypeDTO = new RoomTypeDTO();
        roomTypeDTO.setId(roomType.getId());
        roomTypeDTO.setName(roomType.getName());
        return roomTypeDTO;
    }

}
