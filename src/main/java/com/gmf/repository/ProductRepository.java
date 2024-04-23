package com.gmf.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gmf.models.ProductModel;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel , UUID> {
}
