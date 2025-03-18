package com.ironhack.lab303.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Conference extends Exposition {

    public Conference(LocalDate eventDate, Integer duration, String location, String title, List<Guest> list) {
        super(eventDate, duration, location, title, list);
    }

    public Conference() {
    }


    @OneToMany(mappedBy = "conference", cascade = CascadeType.ALL)
    private List<Speakers> speakers;



}
