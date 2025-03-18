package com.ironhack.lab303.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer memberId;
    private String name;

    @Enumerated(EnumType.STRING)
    private StatusMember status;
    private LocalDate renewalDate;

//    @OneToOne(mappedBy = "president")
//    private Chapter chapter01;

    @ManyToOne
    @JoinColumn(name = "listMember")
    private Chapter chapter02;


    public Member() {
    }

    public Member(String name, StatusMember status, LocalDate renewalDate) {
        this.name = name;
        this.status = status;
        this.renewalDate = renewalDate;
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

    public StatusMember getStatus() {
        return status;
    }

    public void setStatus(StatusMember status) {
        this.status = status;
    }

    public LocalDate getRenewalDate() {
        return renewalDate;
    }

    public void setRenewalDate(LocalDate renewalDate) {
        this.renewalDate = renewalDate;
    }
}
