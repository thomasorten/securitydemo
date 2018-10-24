package com.thomasorten.securitydemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bruker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    String brukernavn;
    String passord;

    public Bruker() {
    }

    public Bruker(Long id, String brukernavn, String passord) {
        this.id = id;
        this.brukernavn = brukernavn;
        this.passord = passord;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrukernavn() {
        return brukernavn;
    }

    public void setBrukernavn(String brukernavn) {
        this.brukernavn = brukernavn;
    }

    public String getPassord() {
        return passord;
    }

    public void setPassord(String passord) {
        this.passord = passord;
    }
}
