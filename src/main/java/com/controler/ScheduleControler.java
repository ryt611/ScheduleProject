package com.controler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@EnableAutoConfiguration
public class ScheduleControler {

	@RequestMapping("/top")
	public String hello (@RequestParam(value="name", required=false, defaultValue="承太郎")String name, Model model){
		model.addAttribute("name", name);
		return "ScheduleView";
	}

	public static void main(String[] args){
		SpringApplication.run(ScheduleControler.class, args);
	}
}
