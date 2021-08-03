package com.eduardotorrezh.challengebuenasnoches.dao;

import com.eduardotorrezh.challengebuenasnoches.entity.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestDAO extends JpaRepository<Guest,Long> {

}
