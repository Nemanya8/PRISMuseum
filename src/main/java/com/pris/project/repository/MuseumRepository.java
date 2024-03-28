package com.pris.project.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.pris.project.entity.Artwork;
import com.pris.project.entity.Museum;

public interface MuseumRepository extends MongoRepository<Museum,ObjectId>{

	Museum findByName(String name);

}
