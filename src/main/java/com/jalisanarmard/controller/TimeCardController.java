package com.jalisanarmard.controller;


import com.jalisanarmard.domain.TimeCard;
import com.jalisanarmard.repository.TimeCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class TimeCardController {

    @Autowired
    TimeCardRepository timeCardRepository;

    @RequestMapping(value = "/timecard", method = RequestMethod.GET)
    public List<TimeCard> getAllTimeCard(){
        return timeCardRepository.findAll();
    }

    @RequestMapping(value = "/timecard" , method = RequestMethod.POST)
    public TimeCard submitTimeCard(@RequestBody TimeCard timeCard){
        timeCardRepository.save(timeCard);
        return timeCard;
    }

    @RequestMapping(value = "/timecard" , method = RequestMethod.OPTIONS)
    public ResponseEntity handle(){
        return new ResponseEntity(HttpStatus.OK);
    }

}
