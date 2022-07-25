package com.evoter.api.controller;


import com.evoter.api.entity.Voter;
import com.evoter.api.service.VoterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.*;


@Slf4j
@RestController
public class VoterController {

    @Autowired
    VoterService voterService;

    @GetMapping("/getAllVoters")
    public ResponseEntity<List> getAllVoters(@RequestParam("wardNo") int wardNo) {
        log.info(String.valueOf(voterService.getAllVoters()));
        return ResponseEntity.ok(voterService.getAllVoters());
    }

    @GetMapping("/getByBoothNo")
    public ResponseEntity<List> getByBoothNo(@RequestParam("boothNo") int boothNo,@RequestParam("wardNo") int wardNo) {
        return ResponseEntity.ok(voterService.getByBoothNo(boothNo, wardNo));
    }

    @GetMapping("/Test")
    public  String testMethod(){
        return "Run Success";
    }



}
