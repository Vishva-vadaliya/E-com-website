package com.telusko.ecom_project.model;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@JsonProperty("id")
	private int id;
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("desc")
	private String desc;
	
	@JsonProperty("brand")
	private String brand;
	
	@JsonProperty("price")
	private BigDecimal price;
	
	@JsonProperty("category")
	private String category;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	@JsonProperty("release_date")
	private Date releaseDate;
	
	@JsonProperty("available")
	private boolean available;
	
	@JsonProperty("quantity")
	private int quantity;
	
	@JsonProperty("image_name")
	private String imageName;
	
	@JsonProperty("image_type")
	private String imageType;
	
	@JsonProperty("image_date")
	@Lob
	private byte[] imageData;

	

//	public String setImageName(String originalFilename) {
//		// TODO Auto-generated method stub
//		return imageName;
//	}
//
//
//
//	public String setImageType(String contentType) {
//		// TODO Auto-generated method stub
//		return imageType;
//		
//	}
//
//
//
//	public byte[] setImageData(byte[] bytes) {
//		// TODO Auto-generated method stub
//		return imageData;
//	}
//
//
//
//	public String getImageType() {
//		// TODO Auto-generated method stub
//		return ;
//	}
	
	public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    // Getter and Setter for imageType
    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    // Getter and Setter for imageData
    public byte[] getImageData() {
        return imageData;
    }

    public void setImageData(byte[] imageData) {
        this.imageData = imageData;
    }



}
