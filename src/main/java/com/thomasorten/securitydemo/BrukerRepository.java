package com.thomasorten.securitydemo;

import org.springframework.data.repository.Repository;

import java.util.List;

public interface BrukerRepository extends Repository<Bruker, Long> {
    public List<Bruker> findAll();
    public void save(Bruker person);
    public Bruker findByBrukernavn(String brukernavn);
}

