package com.niq.assignment.repositories;

import com.niq.assignment.dto.ProductResponse;
import com.niq.assignment.model.ProductMetadata;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<ProductMetadata, String> {

    @Query("SELECT pm " +
            "FROM PersonalizedProduct pp " +
            "JOIN pp.shelf psi " +
            "JOIN ProductMetadata pm ON psi.productId = pm.productId " +
            "WHERE pp.shopperId = :shopperId")
    List<ProductMetadata> findProductsByShopperId(@Param("shopperId") String shopperId);

    /*@Query("SELECT pm " +
            "FROM PersonalizedProduct pp " +
            "JOIN pp.shelf psi " +
            "JOIN ProductMetadata pm ON psi.productId = pm.productId " +
            "WHERE pp.shopperId = :shopperId " +
            "AND (:brand IS NULL OR pm.brand = :brand) " +
            "AND (:category IS NULL OR pm.category = :category)")
    List<ProductMetadata> findFilteredProducts(@Param("shopperId") String shopperId,
                                               @Param("brand") String brand,
                                               @Param("category") String category,
                                                @Param("limit_value") int lim);*/

    @Query("SELECT pm " +
            "FROM PersonalizedProduct pp " +
            "JOIN pp.shelf psi " +
            "JOIN ProductMetadata pm ON psi.productId = pm.productId " +
            "WHERE pp.shopperId = :shopperId " +
            "AND (:brand IS NULL OR pm.brand = :brand) " +
            "AND (:category IS NULL OR pm.category = :category)")
    List<ProductMetadata> findFilteredProducts(@Param("shopperId") String shopperId,
                                               @Param("brand") String brand,
                                               @Param("category") String category,
                                               Pageable pageable);


}
