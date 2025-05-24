package com.fungiflow.fungiflow.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.fungiflow.fungiflow.model.Supplier;

@Repository
public interface SupplierRepo extends JpaRepository<Supplier, Long> {
}
