package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.limitservice.Configuration;
import com.example.demo.limitservice.LimitConfiguration;

@RestController
public class LimitsConfigurationController {

	@Autowired
	private Configuration config;
	
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfigurations() {
		return new LimitConfiguration(config.getMinimum(), config.getMaximum());
	}
	
}
