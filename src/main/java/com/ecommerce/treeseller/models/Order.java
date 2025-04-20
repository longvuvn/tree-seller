package com.ecommerce.treeseller.models;


import com.ecommerce.treeseller.enums.OrderStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.time.Instant;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "\"order\"")
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false, columnDefinition = "VARCHAR(200)")
    private String name;
    @Column(columnDefinition = "TEXT")
    private String note;
    private OrderStatus status;
    private Instant createdTime;
    private Instant updatedTime;
    private Instant updatedBy;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "shipping_id")
    private ShippingInfo shipping;

    @OneToMany(mappedBy = "order", fetch = FetchType.LAZY)
    private Set<OrderDetail> detail;
}
