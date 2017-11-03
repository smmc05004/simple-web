package com.sample.employee.dao;

import java.util.List;

import com.sample.employee.vo.Job;

public interface JobDao {

	void addJob(Job job);
	List<Job> getAllJobs();
}
