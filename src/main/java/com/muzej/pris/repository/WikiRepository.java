package com.muzej.pris.repository;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.muzej.pris.model.Wiki;

public interface WikiRepository extends MongoRepository<Wiki, ObjectId> {
	
	Optional<Wiki> findByTitle(String title);
}
