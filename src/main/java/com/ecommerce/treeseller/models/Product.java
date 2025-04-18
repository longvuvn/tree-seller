package com.ecommerce.treeseller.models;

import com.ecommerce.treeseller.enums.ProductStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "\"product\"")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false, columnDefinition = "VARCHAR(200)")
    private String name;
    @Column(columnDefinition = "TEXT")
    private String description;

    private BigDecimal price;

    @Column(columnDefinition = "TEXT")
    private String image;

    private ProductStatus status;
    private Instant createdTime;
    private Instant updatedTime;
    private Instant updatedBy;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
