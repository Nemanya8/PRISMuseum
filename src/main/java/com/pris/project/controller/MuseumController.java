package com.pris.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pris.project.entity.Museum;
import com.pris.project.service.MuseumService;

@RestController
@RequestMapping("/museum")
public class MuseumController {

	@Autowired
	private MuseumService museumService;
	
	@GetMapping("/getAll")
	public List<Museum> getAll() {

		return museumService.getAll();
	}

	@GetMapping("/getByName")
	public Museum getByName(@RequestParam String name) {

		return museumService.getByName(name);
	}
	
	@PostMapping("/addMuseum")
    public ResponseEntity<String> addMuseum(@RequestParam String name, @RequestParam String image, @RequestParam String address) {
        museumService.addMuseum(name,image,address );
        return ResponseEntity.ok("Museum added successfully");
    }
}
