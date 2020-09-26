package br.com.nimbus21.sweetlyrics.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.nimbus21.sweetlyrics.domain.Letra;
import br.com.nimbus21.sweetlyrics.repository.LetraRepository;

@Controller
public class HomeController {
	
		@Autowired
		private LetraRepository letrasRepo;
		
		@GetMapping("/show")
		public String inicio(Model model) {
			List<Letra> listaLetras = letrasRepo.findAll();
			model.addAttribute("letrasList", listaLetras);
			System.out.println("Olar");
			System.out.println(listaLetras.get(0).getMusica().getNome());
			return "index";
		}
		
		/*
		@GetMapping("/exibirIdols")
		public String mostraIdols(Model model) {
			List<Idol> listaIdols = idolsRepo.findAll();
			model.addAttribute("idolsList", listaIdols);
			return "crud/idols";
		}
		*/
}
