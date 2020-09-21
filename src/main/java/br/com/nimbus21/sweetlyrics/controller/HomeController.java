package br.com.nimbus21.sweetlyrics.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {
	
		@GetMapping()
		public String inicio() {
			return "index";
		}
}
