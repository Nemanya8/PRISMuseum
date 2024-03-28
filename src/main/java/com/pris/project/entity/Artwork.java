package com.pris.project.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "artworks")
public class Artwork {

	@Id
	private ObjectId _id;

	private String name;
	
	private ArtworkType artworkType;
	
	private String description;
	
	private String image;
	
	private int creationYear;
	
	private String artPeriod;
	
	private String authorName;
	
	private String authorSurname;
	
	//Zbog google map-a mozda ni ne treba imati gps kao polje, ili ga staviti kao String
	private double gpsCoordinates;
	
	private int approxTimeMinutes;
	
	private Museum museum;
	
	



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

	public ArtworkType getArtworkType() {
		return artworkType;
	}

	public void setArtworkType(ArtworkType artworkType) {
		this.artworkType = artworkType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getCreationYear() {
		return creationYear;
	}

	public void setCreationYear(int creationYear) {
		this.creationYear = creationYear;
	}

	public String getArtPeriod() {
		return artPeriod;
	}

	public void setArtPeriod(String artPeriod) {
		this.artPeriod = artPeriod;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getAuthorSurname() {
		return authorSurname;
	}

	public void setAuthorSurname(String authorSurname) {
		this.authorSurname = authorSurname;
	}

	public double getGpsCoordinates() {
		return gpsCoordinates;
	}

	public void setGpsCoordinates(double gpsCoordinates) {
		this.gpsCoordinates = gpsCoordinates;
	}

	public int getApproxTimeMinutes() {
		return approxTimeMinutes;
	}

	public void setApproxTimeMinutes(int approxTimeMinutes) {
		this.approxTimeMinutes = approxTimeMinutes;
	}

	public Museum getMuseum() {
		return museum;
	}

	public void setMuseum(Museum museum) {
		this.museum = museum;
	}

	@Override
	public String toString() {
		return "Artwork [_id=" + _id + ", name=" + name + ", artworkType=" + artworkType + ", description="
				+ description + ", image=" + image + ", creationYear=" + creationYear + ", artPeriod=" + artPeriod
				+ ", authorName=" + authorName + ", authorSurname=" + authorSurname + ", gpsCoordinates="
				+ gpsCoordinates + ", approxTimeMinutes=" + approxTimeMinutes + ", museum=" + museum + "]";
	}
	
}

