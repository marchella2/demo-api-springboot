package com.example.learndemoapi.models.repositories;

import com.example.learndemoapi.models.entities.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepo extends CrudRepository<Product, Long> {

    List<Product> findByNameContains(String name);
}
