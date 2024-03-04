package com.niq.assignment.repositories;

import com.niq.assignment.model.ProductMetadata;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductMetadataRepository extends JpaRepository<ProductMetadata, String> {

}
