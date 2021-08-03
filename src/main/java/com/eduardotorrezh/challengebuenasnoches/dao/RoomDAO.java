package com.eduardotorrezh.challengebuenasnoches.dao;

import com.eduardotorrezh.challengebuenasnoches.entity.Hotel;
import com.eduardotorrezh.challengebuenasnoches.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoomDAO extends JpaRepository<Room,Long> {
    List<Room> findByHotel(Hotel hotel);

}
