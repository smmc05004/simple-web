package com.sample.employee.service;

import java.util.List;
import com.sample.employee.dao.JobDao;
import com.sample.employee.vo.Job;

public class EmployeeServiceImpl implements EmployeeService{

	// implements된 dao가 아닌 interface의 dao를 얻어와야 함
	private JobDao jobDao;
	public void setJobDao(JobDao jobDao) {
		this.jobDao = jobDao;
	}
	
	@Override
	public void addNewJob(Job job) {
		/*
		if (jobDao.getJob(job.getId()) != null) {
			throw new HRException("이미 등록된 id입니다.");
		}
		*/
		jobDao.addJob(job);
	}

	@Override
	public List<Job> getAllJobs() {
		return jobDao.getAllJobs();
	}
}
