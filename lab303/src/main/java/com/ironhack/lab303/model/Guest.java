package com.ironhack.lab303.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer memberId;
    private String name;

    @Enumerated(EnumType.STRING)
    private StatusGuest status;

    @ManyToOne
    @JoinColumn(name = "list")
    private Exposition event;

    public Guest() {
    }

    public Guest(String name, StatusGuest status, Exposition event) {
        this.name = name;
        this.status = status;
        this.event = event;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StatusGuest getStatus() {
        return status;
    }

    public void setStatus(StatusGuest status) {
        this.status = status;
    }

    public Exposition getEvent() {
        return event;
    }

    public void setEvent(Exposition event) {
        this.event = event;
    }
}
