package com.kodlama.io.hrms.business.abstracts;

import com.kodlama.io.hrms.entities.concretes.JobPosition;

import java.util.List;



public interface JobPositionService {
	List<JobPosition> getAll();

}
