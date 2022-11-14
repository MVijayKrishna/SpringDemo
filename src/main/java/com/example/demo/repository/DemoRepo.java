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
		int intAge = Integer.parseInt(Age);
		if (intAge <= 30)
			System.out.println(Name + "  is not eligible for " + Company);

		return Name + " You can't apply the job for Google becouse of your age shoud be >18";
	}

}
