package com.sip.ams.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class HomeController {

	@PostMapping("/result")
	@ResponseBody
	public String resultat(@RequestParam("nom") String n, @RequestParam("email") String e) {
		return ("Vous avez tapez : \n un nom: " + n + "\n un email: " + e);
	}

	@RequestMapping("/information")
	public String info(Model model) {
		String formation = "FullStack";
		model.addAttribute("workshop", formation);

		ArrayList<String> tab = new ArrayList<>();

		tab.add("OCA");
		tab.add("OCP");
		tab.add("Spring");
		tab.add("Angular");

		model.addAttribute("tab", tab);

		return "Home/info";
	}

	@RequestMapping("/affichage")
	public String affiche() {
		System.out.println("Méthode affichage");
		return "Home/affichage";
	}
}
