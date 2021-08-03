package com.eduardotorrezh.challengebuenasnoches.dto;

import lombok.*;

@Getter
@Setter
@Builder
public class HotelDTO {

    private Long id;
    private String name;
    private String description;
    private int stars;
}
