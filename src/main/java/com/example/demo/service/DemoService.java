package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.DemoRepo;

@Service
public class DemoService {
	@Autowired
	private DemoRepo demoRepo;

	public String hello() {
		return demoRepo.hello();
	}

}
