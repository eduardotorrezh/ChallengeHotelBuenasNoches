package com.eduardotorrezh.challengebuenasnoches.service.impl;

import com.eduardotorrezh.challengebuenasnoches.dao.HotelDAO;
import com.eduardotorrezh.challengebuenasnoches.dao.RoomDAO;
import com.eduardotorrezh.challengebuenasnoches.dto.RoomDTO;
import com.eduardotorrezh.challengebuenasnoches.dto.request.RoomReqDTO;
import com.eduardotorrezh.challengebuenasnoches.dto.response.RoomRespDTO;
import com.eduardotorrezh.challengebuenasnoches.exception.InvalidDataException;
import com.eduardotorrezh.challengebuenasnoches.mapper.RoomMapper;
import com.eduardotorrezh.challengebuenasnoches.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.eduardotorrezh.challengebuenasnoches.utils.Constants.ROOM_NOT_EXIST;

@Service
public class RoomServiceImp implements RoomService {

    @Autowired
    RoomDAO roomDAO;

    @Autowired
    HotelDAO hotelDAO;

    @Autowired
    RoomMapper roomMapper;

    @Override
    public RoomDTO addRoom(RoomDTO roomDTO) {
        return roomMapper.roomToRoomDTO(roomDAO.save(roomMapper.roomDTOToRoom(roomDTO)));
    }

    @Override
    public RoomDTO updateRoom(Long id, RoomReqDTO roomReqDTO) {
        if(roomDAO.existsById(id)){
            roomReqDTO.setId(id);
            return roomMapper.roomToRoomDTO(roomDAO.save(roomMapper.mergeRoomReqDTOAndToRoom(roomMapper.roomToRoomDTO(roomDAO.getById(id)),roomReqDTO)));
        }else{
            throw new InvalidDataException(ROOM_NOT_EXIST);
        }
    }

    @Override
    public void deleteRoom(long id) {
        if(roomDAO.existsById(id)){
            roomDAO.deleteById(id);
        }else{
            throw new InvalidDataException(ROOM_NOT_EXIST);
        }
    }

    @Override
    public RoomDTO getRoomId(long id) {
        if(roomDAO.existsById(id)){
            return roomMapper.roomToRoomDTO(roomDAO.getById(id));
        }else{
            throw new InvalidDataException(ROOM_NOT_EXIST);
        }
    }

    @Override
    public List<RoomRespDTO> roomsByIdHotel(long id) {
        return roomMapper.roomListToRoomRespDTOList(roomDAO.findByHotel(hotelDAO.getById(id)));
    }
}
