package com.ojas.inventorymanagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class BrandMapping {
	@Id
	@GeneratedValue
    private int id;
	
private int model_id;
private int brand_id;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getModel_id() {
	return model_id;
}
public void setModel_id(int model_id) {
	this.model_id = model_id;
}
public int getBrand_id() {
	return brand_id;
}
public void setBrand_id(int brand_id) {
	this.brand_id = brand_id;
}
@Override
public String toString() {
	return "BrandMapping [id=" + id + ", model_id=" + model_id + ", brand_id=" + brand_id + "]";
}

}
