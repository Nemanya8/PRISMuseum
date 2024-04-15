package com.muzej.pris.model;

import java.io.Serializable;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.NotNull;

@Document(collection = "wiki")
public class Wiki implements Serializable {

	private static final long serialVersionUID = -9115808193734494759L;

	@Id
	@JsonProperty("id")
	private ObjectId id;
	
	@NotNull
	@JsonProperty("title")
	private String title;
	
	@NotNull
	@JsonProperty("category")
	private String category;
	
	@NotNull
	@JsonProperty("content")
	private String content;
	
	public Wiki(ObjectId id, String title, String category, String content) {
		this.id = id;
		this.title = title;
		this.category = category;
		this.content = content;
	}
	
	public ObjectId getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}

	public String getContent() {
		return content;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
