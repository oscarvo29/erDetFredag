package com.example.demo.Controllers;

import com.example.demo.Services.ErDetFredag;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyFirstController {


	@GetMapping("/")
	@ResponseBody
	public String printDate() {
		ErDetFredag erf = new ErDetFredag();
		return erf.returnDate();
	}
	
	@GetMapping("/test")
	@ResponseBody
	public String MyFirstController(@RequestParam String echo) {
		return echo;
	}
}
