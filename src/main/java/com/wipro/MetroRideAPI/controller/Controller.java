package com.wipro.MetroRideAPI.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class Controller {
	@RestController
	public class MetroController {

	    @GetMapping("/api/metro")
	    public String metro() {
	        return "Welcome to MetroRide API";
	    }
	}

}
