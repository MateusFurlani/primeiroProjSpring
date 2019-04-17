package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Inicial {
	
	@RequestMapping("/")
	String home() {
		return "Teste do Spring que vou ficar rico";
	}

}
