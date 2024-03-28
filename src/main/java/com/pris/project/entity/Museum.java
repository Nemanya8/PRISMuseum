package com.pris.project.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "museums")
public class Museum {
	
	@Id
	private ObjectId _id;
	
	private String name;
	
	private String image;
	
	private String address;
	
	

	public Museum(String name, String image, String address) {
		super();
		this.name = name;
		this.image = image;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Museum [_id=" + _id + ", name=" + name + ", image=" + image + ", address=" + address + "]";
	}

	public ObjectId get_id() {
		return _id;
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
