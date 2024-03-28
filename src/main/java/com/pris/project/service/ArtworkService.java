package com.pris.project.service;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pris.project.entity.Artwork;
import com.pris.project.entity.ArtworkType;
import com.pris.project.entity.Museum;
import com.pris.project.repository.ArtworkRepository;
import com.pris.project.repository.MuseumRepository;

@Service
public class ArtworkService {

	@Autowired
	private ArtworkRepository artworkRepository;
	
	@Autowired
	private MuseumRepository museumRepository;

	public List<Artwork> getAll() {

		return artworkRepository.findAll();
	}

	public Artwork getByName(String name) {

		return artworkRepository.findByName(name);
	}
	
	 public Artwork getById(String id) {
	        return artworkRepository.findBy_id(new ObjectId(id));
	    }

	public void addArtwork(String name,String type,String description,String image,int year,String artPer,
			String authName,String authSur,double gps,int time,String museumName) {
		  	Museum m = museumRepository.findByName(museumName);
		  	ArtworkType at = ArtworkType.valueOf(type.toUpperCase());
		  	Artwork a = new Artwork();
		  	a.setName(name);
	        a.setArtworkType(at);
	        a.setDescription(description);
	        a.setImage(image);
	        a.setCreationYear(year);
	        a.setArtPeriod(artPer);
	        a.setAuthorName(authName);
	        a.setAuthorSurname(authSur);
	        a.setGpsCoordinates(gps);
	        a.setApproxTimeMinutes(time);
	        a.setMuseum(m);
	        artworkRepository.save(a);
		
	}
	
	public void deleteById(String id) {
        artworkRepository.deleteBy_id(new ObjectId(id));
    }
	
}
