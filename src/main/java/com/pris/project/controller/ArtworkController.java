package com.pris.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pris.project.entity.Artwork;
import com.pris.project.entity.ArtworkType;
import com.pris.project.entity.Museum;
import com.pris.project.service.ArtworkService;
import com.pris.project.service.MuseumService;

@RestController
@RequestMapping("/artwork")
public class ArtworkController {
	
	//TODO: Update funkcionalnost za Muzej i za gps koordinate.

	@Autowired
	private ArtworkService artworkService;
	
	@Autowired
	private MuseumService museumService;

	@GetMapping("/getAll")
	public List<Artwork> getAll() {

		return artworkService.getAll();
	}

	@GetMapping("/getByName")
	public Artwork getByName(@RequestParam String name) {

		return artworkService.getByName(name);
	}
	
	@GetMapping("/getById")
	public Artwork getById(@RequestParam String id) {

		return artworkService.getById(id);
	}
	
	@PostMapping("/add")
    public ResponseEntity<String> addArtwork(@RequestParam String name, @RequestParam String type, @RequestParam String description, @RequestParam String image, @RequestParam int year, @RequestParam String artPer, @RequestParam String authName, @RequestParam String authSur, @RequestParam double gps, @RequestParam int time, @RequestParam String museumName) {
        
       /* a.setName(name);
        a.setArtworkType(typeE);
        a.setDescription(description);
        a.setImage(image);
        a.setCreationYear(year);
        a.setArtPeriod(artPer);
        a.setAuthorName(authName);
        a.setAuthorSurname(authSur);
        a.setGpsCoordinates(gps);
        a.setApproxTimeMinutes(time);
        a.setMuseum(m);*/
    	
		artworkService.addArtwork(name,type,description,image,year,artPer,authName,authSur,gps,time,museumName);
        return ResponseEntity.ok("Artwork added successfully");
    }
	
	@DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteById(@PathVariable String id) {
        artworkService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body("Successful removal of a document with ID: " + id);
    }
	
	@ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleIllegalArgumentException(IllegalArgumentException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                             .body("Invalid argument: " + ex.getMessage());
    }
	

}


