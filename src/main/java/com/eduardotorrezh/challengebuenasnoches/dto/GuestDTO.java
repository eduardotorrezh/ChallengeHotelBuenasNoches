package com.eduardotorrezh.challengebuenasnoches.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class GuestDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;

}
