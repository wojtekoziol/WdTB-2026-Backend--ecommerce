package pl.wsb.ecommerce.order;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

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

    protected OrderLine(Long id, int quantity, BigDecimal price, int discountPct, String comment) {
        this.id = id;
        this.quantity = quantity;
        this.price = price;
        this.discountPct = discountPct;
        this.comment = comment;
    }
}
