package com.ironhack.lab303.model;

import jakarta.persistence.*;

@Entity
public class Speakers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer speakerId;
    private String name;
    private Integer presentationDuration;

    @ManyToOne
    @JoinColumn(name = "conference")
    private Conference conference;

    public Speakers() {
    }

    public Speakers(String name, Integer presentationDuration) {
        this.name = name;
        this.presentationDuration = presentationDuration;
    }

    public Integer getSpeakerId() {
        return speakerId;
    }

    public void setSpeakerId(Integer speakerId) {
        this.speakerId = speakerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPresentationDuration() {
        return presentationDuration;
    }

    public void setPresentationDuration(Integer presentationDuration) {
        this.presentationDuration = presentationDuration;
    }
}
