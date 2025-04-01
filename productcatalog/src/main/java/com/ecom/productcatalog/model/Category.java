package com.ecom.productcatalog.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data

public class Category
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    @OneToMany(mappedBy = "category",
                cascade = CascadeType.ALL,
                fetch = FetchType.LAZY)


   // @JsonManagedReference
    private Set<Product> products;
}
