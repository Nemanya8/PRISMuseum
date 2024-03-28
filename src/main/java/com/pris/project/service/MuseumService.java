package com.pris.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pris.project.entity.Artwork;
import com.pris.project.entity.Museum;
import com.pris.project.repository.MuseumRepository;

@Service
public class MuseumService {
	@Autowired
	private MuseumRepository museumRepository;

	public List<Museum> getAll() {
		
		return museumRepository.findAll();
	}

	public Museum getByName(String name) {
		
		return museumRepository.findByName(name);
	}

	public void addMuseum(String name, String image, String address) {
		Museum museum = new Museum(name, image, address);
		museumRepository.save(museum);
	}

}
