package com.example.phonedesign.phonedesign.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PhoneBrand {
	
	@Id
	private Integer brandId;
	
	@Column(length = 15)
	private String brandName;

	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	

	
	

	
	

	

	
	
	
}
