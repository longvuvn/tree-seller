package com.ecommerce.treeseller.models;

import com.ecommerce.treeseller.enums.ShippingStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "\"shipping_info\"")
@Data
public class ShippingInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private String description;
    private String phone;
    private ShippingStatus status;

    @OneToMany(mappedBy = "shipping", fetch = FetchType.LAZY)
    private Set<Order> order;

}
