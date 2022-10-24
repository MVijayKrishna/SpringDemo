package com.example.demo.repository;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class DemoRepo {
	@Value("${Age}")
	private String Age;

	@Value("${Salary}")
	private String Salary;

	@Value("${Name}")
	private String Name;

	@Value("${Company}")
	private String Company;

	public String hello() {

		return Name + " age is = " + Age + " and salary is =" + " " + Salary + " working in  " + Company;
	}

}
