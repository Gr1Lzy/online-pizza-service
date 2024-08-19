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
@Table(name = "product_items")
public class ProductItem extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "size")
    private Long size;

    @Column(name = "pizza_type")
    private Long pizzaType;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @OneToMany(mappedBy = "productItem", cascade = CascadeType.ALL, orphanRemoval = true)
    @ToString.Exclude
    private Set<CartItem> cartItems;
}
