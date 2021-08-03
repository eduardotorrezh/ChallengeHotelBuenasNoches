package com.eduardotorrezh.challengebuenasnoches.service.impl;

import com.eduardotorrezh.challengebuenasnoches.dao.RoomTypeDAO;
import com.eduardotorrezh.challengebuenasnoches.dto.RoomTypeDTO;
import com.eduardotorrezh.challengebuenasnoches.mapper.RoomTypeMapper;
import com.eduardotorrezh.challengebuenasnoches.service.RoomTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomTypeServiceImp implements RoomTypeService {

    @Autowired
    RoomTypeDAO roomTypeDAO;

    @Autowired
    RoomTypeMapper roomTypeMapper;

    @Override
    public RoomTypeDTO addRoomType(RoomTypeDTO roomTypeDTO) {
        return roomTypeMapper.RoomTypeToRoomTypeDTO(roomTypeDAO.save(roomTypeMapper.RoomTypeDTOToRoomType(roomTypeDTO)));
    }

}
