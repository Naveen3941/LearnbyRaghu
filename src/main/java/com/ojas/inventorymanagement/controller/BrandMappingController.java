package com.ojas.inventorymanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.inventorymanagement.model.BrandMapping;
import com.ojas.inventorymanagement.model.Model;
import com.ojas.inventorymanagement.service.BrandMappingService;

@RestController
public class BrandMappingController {
    @Autowired
	public BrandMappingService brandMappingService;
    
    @PostMapping("/save")
    public void saveData(@RequestBody BrandMapping brandMapping)
    {
    	System.out.println(brandMapping);
    	brandMappingService.saveData(brandMapping);
    }
    
    @PostMapping("/savemodel")
    public void saveDataModel(@RequestBody Model model)
    {
    	brandMappingService.saveData(model);
    }
   
}
