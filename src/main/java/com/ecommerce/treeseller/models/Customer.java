package com.ecommerce.treeseller.models;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "\"customer\"")
@Data
@PrimaryKeyJoinColumn(name = "id")
public class Customer extends User {
    private boolean isSpecial;
}
