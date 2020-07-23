package com.ojas.inventorymanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ojas.inventorymanagement.model.BrandMapping;


@Repository
public interface BrandMappingDao extends JpaRepository<BrandMapping, Long> {

}
