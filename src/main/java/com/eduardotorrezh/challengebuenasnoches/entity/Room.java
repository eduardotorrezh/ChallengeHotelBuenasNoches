package com.eduardotorrezh.challengebuenasnoches.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "room")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "floor")
    private int floor;

    @Column(name = "max_guests")
    private int maxGuests;

    @ManyToOne
    @JoinColumn(name = "id_room_type")
    private RoomType roomType;

    @ManyToOne
    @JoinColumn(name = "id_hotel")
    private Hotel hotel;

}
