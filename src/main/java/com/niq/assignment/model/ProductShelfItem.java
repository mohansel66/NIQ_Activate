package com.niq.assignment.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "product_shelf_item")
public class ProductShelfItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "personalized_product_id")
    private PersonalizedProduct personalizedProduct;

    @Column(name = "product_id")
    private String productId;

    @Column(name = "relevancy_score")
    private Double relevancyScore;


}

