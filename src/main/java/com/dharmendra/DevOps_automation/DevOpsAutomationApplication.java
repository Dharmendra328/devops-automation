package com.dharmendra.DevOps_automation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api/v1")
public class DevOpsAutomationApplication {
	
	@GetMapping("/employee")
	public String getAllEmployees1() {
		return "Hello Dharma";
	}

	public static void main(String[] args) {
		SpringApplication.run(DevOpsAutomationApplication.class, args);
	}

}
