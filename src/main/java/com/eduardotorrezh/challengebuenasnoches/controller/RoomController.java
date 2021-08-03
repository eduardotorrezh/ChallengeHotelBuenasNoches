package com.eduardotorrezh.challengebuenasnoches.controller;

import com.eduardotorrezh.challengebuenasnoches.dto.ResponseDTO;
import com.eduardotorrezh.challengebuenasnoches.dto.RoomDTO;
import com.eduardotorrezh.challengebuenasnoches.dto.request.RoomReqDTO;
import com.eduardotorrezh.challengebuenasnoches.service.RoomService;
import com.eduardotorrezh.challengebuenasnoches.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("room")
@RestController
public class RoomController {

    @Autowired
    RoomService roomService;

    @PutMapping(value= "/create")
    public ResponseEntity<ResponseDTO<RoomDTO>> addRoom (@RequestBody RoomDTO roomDTO){
        ResponseDTO<RoomDTO> responseDTO = new ResponseDTO(Constants.ResponseConstant.SUCCESS.getDescription(), roomService.addRoom(roomDTO));
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ResponseDTO<RoomDTO>> getRoomById(@PathVariable(value = "id")  int id) {
        ResponseDTO<RoomDTO> responseDTO = new ResponseDTO(Constants.ResponseConstant.SUCCESS.getDescription(), roomService.getRoomId(id));
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @PutMapping(value= "/{id}/update")
    public ResponseEntity<ResponseDTO<RoomDTO>> updateRoom (@PathVariable("id") long id, @RequestBody RoomReqDTO roomDTO){
        ResponseDTO<RoomDTO> responseDTO = new ResponseDTO(Constants.ResponseConstant.SUCCESS.getDescription(), roomService.updateRoom(id, roomDTO));
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @GetMapping(value = "/hotel/{id}")
    public ResponseEntity<ResponseDTO<List<RoomDTO>>> getRoomsByIdHotel(@PathVariable(value = "id")  int id) {
        ResponseDTO<List<RoomDTO>> responseDTO = new ResponseDTO(Constants.ResponseConstant.SUCCESS.getDescription(), roomService.roomsByIdHotel(id));
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

}
