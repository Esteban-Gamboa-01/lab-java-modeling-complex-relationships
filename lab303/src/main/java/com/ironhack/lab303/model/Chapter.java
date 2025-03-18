package com.ironhack.lab303.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Chapter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer chapterId;
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "president",referencedColumnName = "memberId")
    private Member president;

    @OneToMany(mappedBy = "chapter02", cascade = CascadeType.ALL)
    private List<Member> memberList;

    public Chapter() {
    }

    public Chapter(String name, Member president, List<Member> memberList) {
        this.name = name;
        this.president = president;
        this.memberList = memberList;
    }

    public Integer getChapterId() {
        return chapterId;
    }

    public void setChapterId(Integer chapterId) {
        this.chapterId = chapterId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Member getPresident() {
        return president;
    }

    public void setPresident(Member president) {
        this.president = president;
    }

    public List<Member> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<Member> memberList) {
        this.memberList = memberList;
    }
}
