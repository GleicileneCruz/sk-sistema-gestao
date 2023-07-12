package com.skgestao.sksistemagestao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skgestao.sksistemagestao.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}