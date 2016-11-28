package com.br.eudecido.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.br.eudecido.models.Endereco;
import com.br.eudecido.models.Usuario;

@Controller
public class IndexController {

	
	@RequestMapping(value = {"/", ""}, method = RequestMethod.GET)
	public String index(Model model){
		model.addAttribute("usuario", new Usuario());
		model.addAttribute("confirme_senha", new String());
		return "index";
	}
	
	@RequestMapping(value = "/cadastrar", method = RequestMethod.POST)
	public String index(@ModelAttribute("usuario") Usuario usuario, @ModelAttribute("endereco") Endereco endereco){
		System.out.println(endereco.getBairro() + " " + usuario.getNome());
		
		return "index";
	}
}
