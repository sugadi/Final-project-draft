package com.example.phonedesign.phonedesign.service;

import java.util.List;

import com.example.phonedesign.phonedesign.entity.PhoneBrand;

public interface PhoneBrandService {
	
	public void addBrand(PhoneBrand brand);
	public void deleteBrand(PhoneBrand brand);
	public List<PhoneBrand> getAllBrand();
	public PhoneBrand updateBrand(PhoneBrand brand);
	public PhoneBrand getBrand(Integer id);
}
                                                