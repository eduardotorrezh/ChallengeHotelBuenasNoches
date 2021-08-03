package com.eduardotorrezh.challengebuenasnoches.service.impl;

import com.eduardotorrezh.challengebuenasnoches.dao.HotelDAO;
import com.eduardotorrezh.challengebuenasnoches.dto.HotelDTO;
import com.eduardotorrezh.challengebuenasnoches.exception.InvalidDataException;
import com.eduardotorrezh.challengebuenasnoches.mapper.HotelMapper;
import com.eduardotorrezh.challengebuenasnoches.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.eduardotorrezh.challengebuenasnoches.utils.Constants.USER_NOT_EXIST;

@Service
public class HotelServiceImp implements HotelService {

    @Autowired
    HotelDAO hotelDAO;

    @Autowired
    HotelMapper hotelMapper;


    @Override
    public List<HotelDTO> allHotels() {
        return hotelMapper.hotelListToHotelDTOList(hotelDAO.findAll());
    }

    @Override
    public HotelDTO addHotel(HotelDTO hotelDTO) {
        return hotelMapper.hotelToHotelDTO(hotelDAO.save(hotelMapper.hotelDTOToHotel(hotelDTO)));
    }

    @Override
    public HotelDTO updateHotel(Long id, HotelDTO hotelDTO) {

        if(hotelDAO.existsById(id)){
            hotelDTO.setId(id);
            return hotelMapper.hotelToHotelDTO(hotelDAO.save(hotelMapper.hotelDTOToHotel(hotelDTO)));
        }else{
            throw new InvalidDataException(USER_NOT_EXIST);
        }

    }

    @Override
    public void deleteHotel(long id) {
        if(hotelDAO.existsById(id)){
            hotelDAO.deleteById(id);
        }else{
            throw new InvalidDataException(USER_NOT_EXIST);
        }
    }

    @Override
    public HotelDTO getHotelId(long id) {
        if(hotelDAO.existsById(id)){
            return hotelMapper.hotelToHotelDTO(hotelDAO.getById(id));
        }else{
            throw new InvalidDataException(USER_NOT_EXIST);
        }
    }
}
