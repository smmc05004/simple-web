package com.sample.employee.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.sample.employee.service.EmployeeService;
import com.sample.employee.vo.Job;

// controller는 interface 없이 바로 생성
// 어노테이션 붙여 controller임을 표시

@Controller
public class EmployeeController {

	// @Autowired 붙이면 setter메소드 없이도 service 객체 받아짐
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/list.do")
	//(dispatcherservlet이 괄호 안의 요청이 들어오면 메소드 실행)
	// return 값이 String -> jsp페이지 의미
	public String jobs(Model model) {
		
		List<Job> jobs = employeeService.getAllJobs();
		// request.setAttribute 대신 model.addAttribute에 담음
		model.addAttribute("jobs", jobs);
		
		return "joblist";
	}
}
