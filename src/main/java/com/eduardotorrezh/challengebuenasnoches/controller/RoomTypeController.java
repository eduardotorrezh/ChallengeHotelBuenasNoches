package com.eduardotorrezh.challengebuenasnoches.controller;

import com.eduardotorrezh.challengebuenasnoches.dto.ResponseDTO;
import com.eduardotorrezh.challengebuenasnoches.dto.RoomTypeDTO;
import com.eduardotorrezh.challengebuenasnoches.service.RoomTypeService;
import com.eduardotorrezh.challengebuenasnoches.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("room-type")
public class RoomTypeController {

    @Autowired
    RoomTypeService roomTypeService;

    @PutMapping(value= "/create")
    public ResponseEntity<ResponseDTO<RoomTypeDTO>> addHotel (@RequestBody RoomTypeDTO roomTypeDTO){
        ResponseDTO<RoomTypeDTO> responseDTO = new ResponseDTO(Constants.ResponseConstant.SUCCESS.getDescription(), roomTypeService.addRoomType(roomTypeDTO));
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

}
