package com.eduardotorrezh.challengebuenasnoches.service.impl;

import com.eduardotorrezh.challengebuenasnoches.dao.GuestTypeDAO;
import com.eduardotorrezh.challengebuenasnoches.service.GuestTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GuestTypeServiceImp implements GuestTypeService {

    @Autowired
    GuestTypeDAO guestTypeDAO;




}
