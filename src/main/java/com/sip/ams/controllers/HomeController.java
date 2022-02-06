package com.sip.ams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {
	
	@RequestMapping("/information")
	public String info()
	{
		return "Home/info";
	}

	@RequestMapping("/affichage")
	public String affiche()
	{
		System.out.println("Méthode affichage");
		return "Home/affichage";
	}
}
