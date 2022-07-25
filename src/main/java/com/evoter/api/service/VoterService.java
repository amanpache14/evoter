package com.evoter.api.service;


import com.evoter.api.entity.Voter;
import com.evoter.api.repo.VoterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoterService {
    @Autowired
    VoterRepo voterRepo;


    public List<Voter> getAllVoters(){
        return voterRepo.findAll();
    }

    public List<Voter> getByBoothNo(int boothNo, int wardNo){
        return voterRepo.findByBoothNoAndWardNo(boothNo, wardNo);
    }
}
