package com.sample.employee.service;

import java.util.List;

import com.sample.employee.vo.Job;

public interface EmployeeService {
	
	void addNewJob(Job job);
	List<Job> getAllJobs();
	
}
