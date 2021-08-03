package com.eduardotorrezh.challengebuenasnoches.mapper;

import com.eduardotorrezh.challengebuenasnoches.dto.RoomDTO;
import com.eduardotorrezh.challengebuenasnoches.dto.request.RoomReqDTO;
import com.eduardotorrezh.challengebuenasnoches.dto.response.RoomRespDTO;
import com.eduardotorrezh.challengebuenasnoches.entity.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RoomMapper {

    @Autowired
    HotelMapper hotelMapper;

    @Autowired
    RoomTypeMapper roomTypeMapper;


    public RoomDTO roomToRoomDTO (Room room){
        RoomDTO roomDTO = new RoomDTO();
        roomDTO.setId(room.getId());
        roomDTO.setName(room.getName());
        roomDTO.setDescription(room.getDescription());
        roomDTO.setFloor(room.getFloor());
        roomDTO.setMaxGuests(room.getMaxGuests());
        roomDTO.setHotel(hotelMapper.hotelToHotelDTO(room.getHotel()));
        roomDTO.setRoomType(roomTypeMapper.RoomTypeToRoomTypeDTO(room.getRoomType()));
        return roomDTO;
    }

    public Room roomDTOToRoom (RoomDTO roomDTO){
        Room room = new Room();
        room.setId(roomDTO.getId());
        room.setName(roomDTO.getName());
        room.setDescription(roomDTO.getDescription());
        room.setFloor(roomDTO.getFloor());
        room.setMaxGuests(roomDTO.getMaxGuests());
        room.setHotel(hotelMapper.hotelDTOToHotel(roomDTO.getHotel()));
        room.setRoomType(roomTypeMapper.RoomTypeDTOToRoomType(roomDTO.getRoomType()));
        return room;
    }

    public Room mergeRoomReqDTOAndToRoom (RoomDTO roomDTO, RoomReqDTO roomReqDTO ){
        Room roomResponse = new Room();
        roomResponse.setId(roomDTO.getId());
        roomResponse.setName(roomDTO.getName());
        roomResponse.setDescription(roomReqDTO.getDescription());
        roomResponse.setFloor(roomReqDTO.getFloor());
        roomResponse.setMaxGuests(roomDTO.getMaxGuests());
        roomResponse.setHotel(hotelMapper.hotelDTOToHotel(roomDTO.getHotel()));
        roomResponse.setRoomType(roomTypeMapper.RoomTypeDTOToRoomType(roomReqDTO.getRoomType()));
        return roomResponse;
    }


    public List<RoomDTO> roomListToRoomDTOList(List<Room> roomList){
        List<RoomDTO> roomDTOList = new ArrayList<>();
        roomList.forEach((room) -> {
            roomDTOList.add(roomToRoomDTO(room));
        });
        return roomDTOList;
    }

    public List<Room> roomDTOListToRoomList(List<RoomDTO> roomDTOList){
        List<Room> roomList = new ArrayList<>();
        roomDTOList.forEach((roomDTO) -> {
            roomList.add(roomDTOToRoom(roomDTO));
        });
        return roomList;
    }

    public RoomRespDTO roomToRoomRespDTO (Room room){
        RoomRespDTO roomRespDTO = new RoomRespDTO();
        roomRespDTO.setId(room.getId());
        roomRespDTO.setName(room.getName());
        roomRespDTO.setDescription(room.getDescription());
        roomRespDTO.setFloor(room.getFloor());
        roomRespDTO.setMaxGuests(room.getMaxGuests());
        roomRespDTO.setRoomType(roomTypeMapper.RoomTypeToRoomTypeDTO(room.getRoomType()));
        return roomRespDTO;
    }


    public List<RoomRespDTO> roomListToRoomRespDTOList(List<Room> roomList){
        List<RoomRespDTO> roomRespDTOList = new ArrayList<>();
        roomList.forEach((room) -> {
            roomRespDTOList.add(roomToRoomRespDTO(room));
        });
        return roomRespDTOList;
    }

}
