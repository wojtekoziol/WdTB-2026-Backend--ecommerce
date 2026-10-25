package pl.wsb.ecommerce.order.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "order_line")
public class OrderLine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // TODO:
    // order ID

    // TODO:
    // item ID

    @Column(name = "quantity", nullable = false)
    private int quantity;

    @Column(name = "price", nullable = false, precision = 10, scale = 2)
    private BigDecimal price;

    @Column(name = "discount_pct")
    private int discountPct;

    @Column(name = "comment", length = 255)
    private String comment;

    public OrderLine(Long id, int quantity, BigDecimal price, int discountPct, String comment) {
        this.id = id;
        this.quantity = quantity;
        this.price = price;
        this.discountPct = discountPct;
        this.comment = comment;
    }

    protected OrderLine() {
    }

    public Long getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getDiscountPct() {
        return discountPct;
    }

    public String getComment() {
        return comment;
    }
}
