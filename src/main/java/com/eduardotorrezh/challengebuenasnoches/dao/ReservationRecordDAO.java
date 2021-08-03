package com.eduardotorrezh.challengebuenasnoches.dao;

import com.eduardotorrezh.challengebuenasnoches.entity.ReservationRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRecordDAO extends JpaRepository<ReservationRecord,Long> {

}
