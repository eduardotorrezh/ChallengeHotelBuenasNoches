package com.eduardotorrezh.challengebuenasnoches.dao;

import com.eduardotorrezh.challengebuenasnoches.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationDAO extends JpaRepository<Reservation,Long> {

}
