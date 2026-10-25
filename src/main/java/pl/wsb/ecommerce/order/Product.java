package pl.wsb.ecommerce.order;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "description", length = 255)
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name = "product_size", nullable = false, length = 20)
    private ProductSize productSize;

    @Column(name = "standard_price", nullable = false, precision = 10, scale = 2)
    private BigDecimal standard_price;
}
