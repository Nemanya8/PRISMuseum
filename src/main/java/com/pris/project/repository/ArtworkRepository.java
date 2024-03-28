package com.pris.project.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.pris.project.entity.Artwork;

public interface ArtworkRepository extends MongoRepository<Artwork,ObjectId>{
	
	Artwork findByName(String name);
	Artwork findBy_id(ObjectId id);
	void deleteBy_id(ObjectId id);
}
