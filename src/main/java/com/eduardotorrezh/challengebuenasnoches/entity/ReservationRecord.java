package com.eduardotorrezh.challengebuenasnoches.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "reservation")
public class ReservationRecord {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_guest")
    private Guest guest;

    @ManyToOne
    @JoinColumn(name = "id_room")
    private Room room;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;

    @Column(name = "check_in")
    private boolean checkIn;

    @Column(name = "check_out")
    private boolean checkOut;

}
