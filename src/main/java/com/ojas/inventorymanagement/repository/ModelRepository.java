package com.ojas.inventorymanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ojas.inventorymanagement.model.Model;
@Repository
public interface ModelRepository extends JpaRepository<Model, Long>{

}
