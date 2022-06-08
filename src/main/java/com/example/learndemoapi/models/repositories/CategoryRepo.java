package com.example.learndemoapi.models.repositories;

import com.example.learndemoapi.models.entities.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepo extends CrudRepository<Category, Long> {

}
