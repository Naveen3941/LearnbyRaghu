package com.ojas.inventorymanagement.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Model {
@Id
int model_id;
String model_name;
boolean model_status;
public int getModel_id() {
	return model_id;
}
public void setModel_id(int model_id) {
	this.model_id = model_id;
}
public String getModel_name() {
	return model_name;
}
public void setModel_name(String model_name) {
	this.model_name = model_name;
}
public boolean isModel_status() {
	return model_status;
}
public void setModel_status(boolean model_status) {
	this.model_status = model_status;
}

}
