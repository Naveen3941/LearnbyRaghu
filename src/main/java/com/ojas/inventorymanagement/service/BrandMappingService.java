package com.ojas.inventorymanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.inventorymanagement.model.BrandMapping;
import com.ojas.inventorymanagement.model.Model;
import com.ojas.inventorymanagement.repository.BrandMappingDao;
import com.ojas.inventorymanagement.repository.ModelRepository;

@Service
public class BrandMappingService {
	@Autowired
	BrandMappingDao brandMappingDao;
	@Autowired
	ModelRepository modelRepository;

	public void saveData(BrandMapping brandMapping) {
		brandMappingDao.save(brandMapping);
		
	}

	public void saveData(Model model) {
		modelRepository.save(model);
		
	}

}
