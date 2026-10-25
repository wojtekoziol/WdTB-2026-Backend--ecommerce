package pl.wsb.ecommerce.order.entity;

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

    public Product(String description, Long id, String name, ProductSize productSize, BigDecimal standard_price) {
        this.description = description;
        this.id = id;
        this.name = name;
        this.productSize = productSize;
        this.standard_price = standard_price;
    }

    protected Product() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public ProductSize getProductSize() {
        return productSize;
    }

    public BigDecimal getStandard_price() {
        return standard_price;
    }
}
