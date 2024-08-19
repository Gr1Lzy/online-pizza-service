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
@Table(name = "cart_items")
public class CartItem extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long quantity;

    @ManyToOne
    @JoinColumn(name = "cart_id", nullable = false)
    private Cart cart;

    @ManyToOne
    @JoinColumn(name = "product_item_id", nullable = false)
    private ProductItem productItem;

    @ManyToMany
    @JoinTable(
            name = "cart_item_ingredients",
            joinColumns = @JoinColumn(name = "cart_item_id"),
            inverseJoinColumns = @JoinColumn(name = "ingredient_id")
    )
    @ToString.Exclude
    private Set<Ingredient> ingredients;
}
