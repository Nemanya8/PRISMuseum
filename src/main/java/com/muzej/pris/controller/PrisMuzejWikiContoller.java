package com.muzej.pris.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.muzej.pris.error.WikiIsNotFound;
import com.muzej.pris.model.Wiki;
import com.muzej.pris.repository.WikiRepository;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;

@Validated
@Controller
@RequestMapping(value="/pris")
public class PrisMuzejWikiContoller {
	
	@Autowired
	private WikiRepository wr;
	
	@GetMapping("wikiLink")
	public String getAllWiki(HttpServletRequest request) {
		List<Wiki> wikis = wr.findAll();
		request.getSession().setAttribute("wikis", wikis);
		return "index";
	}
	
	@GetMapping("titleAndContent")
	public String getWikiByTitle(Model m, @Valid String title) {
		Optional<Wiki> wiki = wr.findByTitle(title);
		if (wiki.isEmpty())
			throw new WikiIsNotFound();
		m.addAttribute("wiki", wiki.get());
		return "index";
	}
	
	@ExceptionHandler(value=RuntimeException.class)
	public String handleError(Model m, Exception e) {
		m.addAttribute("error", e.getMessage());
		return "index";
	}
}
