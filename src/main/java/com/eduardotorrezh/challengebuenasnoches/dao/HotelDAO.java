package com.eduardotorrezh.challengebuenasnoches.dao;

import com.eduardotorrezh.challengebuenasnoches.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelDAO extends JpaRepository<Hotel,Long> {

}
