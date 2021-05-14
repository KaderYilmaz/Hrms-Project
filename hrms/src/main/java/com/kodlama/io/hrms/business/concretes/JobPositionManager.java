package com.kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.kodlama.io.hrms.business.abstracts.JobPositionService;
import com.kodlama.io.hrms.dataAccess.abstracts.JobPositionDao;
import com.kodlama.io.hrms.entities.concretes.JobPosition;

public class JobPositionManager implements JobPositionService {
	JobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		this.jobPositionDao= jobPositionDao;
		
	}
	
	@Override
	public List<JobPosition> getAll(){
		return jobPositionDao.findAll()
;	}

}
