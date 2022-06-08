package com.example.learndemoapi.models.repositories;

import com.example.learndemoapi.models.entities.Supplier;
import org.springframework.data.repository.CrudRepository;

public interface SupplierRepo extends CrudRepository<Supplier, Long> {
}
