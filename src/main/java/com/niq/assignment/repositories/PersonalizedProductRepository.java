package com.niq.assignment.repositories;

import com.niq.assignment.model.PersonalizedProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalizedProductRepository extends JpaRepository<PersonalizedProduct, Long> {
}
