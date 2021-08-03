package com.eduardotorrezh.challengebuenasnoches.service;

import com.eduardotorrezh.challengebuenasnoches.dto.RoomDTO;
import com.eduardotorrezh.challengebuenasnoches.dto.request.RoomReqDTO;
import com.eduardotorrezh.challengebuenasnoches.dto.response.RoomRespDTO;

import java.util.List;

public interface RoomService {

    RoomDTO addRoom (RoomDTO roomDTO);
    RoomDTO updateRoom (Long id, RoomReqDTO roomDTO);
    void deleteRoom (long id);
    RoomDTO getRoomId(long id);
    List<RoomRespDTO> roomsByIdHotel(long id);
}
