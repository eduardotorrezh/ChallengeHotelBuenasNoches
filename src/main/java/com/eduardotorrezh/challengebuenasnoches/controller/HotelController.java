package com.eduardotorrezh.challengebuenasnoches.controller;

import com.eduardotorrezh.challengebuenasnoches.dto.HotelDTO;
import com.eduardotorrezh.challengebuenasnoches.dto.ResponseDTO;
import com.eduardotorrezh.challengebuenasnoches.service.HotelService;
import com.eduardotorrezh.challengebuenasnoches.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("hotel")
@RestController
public class HotelController {

    @Autowired
    HotelService hotelService;

    @GetMapping(value= "/all")
    public ResponseEntity<ResponseDTO<List<HotelDTO>>> allHotels (){
        ResponseDTO<List<HotelDTO>> responseDTO = new ResponseDTO(Constants.ResponseConstant.SUCCESS.getDescription(), hotelService.allHotels());
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @PutMapping(value= "/create")
    public ResponseEntity<ResponseDTO<HotelDTO>> addHotel (@RequestBody HotelDTO hotelDTO){
        ResponseDTO<HotelDTO> responseDTO = new ResponseDTO(Constants.ResponseConstant.SUCCESS.getDescription(), hotelService.addHotel(hotelDTO));
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ResponseDTO<HotelDTO>> getHotelById(@PathVariable(value = "id")  int id) {
        ResponseDTO<HotelDTO> responseDTO = new ResponseDTO(Constants.ResponseConstant.SUCCESS.getDescription(), hotelService.getHotelId(id));
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @PutMapping(value= "/{id}/update")
    public ResponseEntity<ResponseDTO<HotelDTO>> updateHotel (@PathVariable("id") long id, @RequestBody HotelDTO hotelDTO){
        ResponseDTO<HotelDTO> responseDTO = new ResponseDTO(Constants.ResponseConstant.SUCCESS.getDescription(), hotelService.updateHotel(id, hotelDTO));
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }


}
