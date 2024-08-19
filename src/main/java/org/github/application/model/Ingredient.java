package org.github.application.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.github.application.util.BaseEntity;

import java.util.Set;

@Getter
@Setter
@ToString(callSuper = true)
@Entity
@Table(name = "ingredients")
public class Ingredient extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "price", nullable = false)
    private Long price;

    @ManyToMany(mappedBy = "ingredients")
    @ToString.Exclude
    private Set<Product> products;

    @ManyToMany(mappedBy = "ingredients")
    @ToString.Exclude
    private Set<CartItem> cartItems;
}
