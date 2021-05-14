package com.kodlama.io.hrms.api.controllers;

import com.kodlama.io.hrms.business.abstracts.JobPositionService;
import com.kodlama.io.hrms.entities.concretes.JobPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/jobPosition")
public class JobPositionController {
    private JobPositionService jobPositionService;

    @Autowired
    public JobPositionController(JobPositionService jobPositionService) {
    	super();
    	this.jobPositionService = jobPositionService;
    }

    @GetMapping("/getAll")
    public List<JobPosition> getAll(){
        return this.jobPositionService.getAll();
    }
}

