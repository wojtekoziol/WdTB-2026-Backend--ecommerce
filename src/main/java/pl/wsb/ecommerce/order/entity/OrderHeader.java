package pl.wsb.ecommerce.order.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "order_header")
public class OrderHeader {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // TODO:
    // private clientId;

    @Column(name = "order_date", nullable = false)
    private LocalDate orderDate;

    @Column(name = "requested_delivery_date")
    private LocalDate requestedDeliveryDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false, length = 20)
    private OrderStatus status;

    @Embedded
    private ShippingAddress shippingAddress;

    public OrderHeader(Long id, LocalDate orderDate, LocalDate requestedDeliveryDate, OrderStatus status, ShippingAddress shippingAddress) {
        this.id = id;
        this.orderDate = orderDate;
        this.requestedDeliveryDate = requestedDeliveryDate;
        this.status = status;
        this.shippingAddress = shippingAddress;
    }

    protected OrderHeader() {
    }

    public Long getId() {
        return id;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public LocalDate getRequestedDeliveryDate() {
        return requestedDeliveryDate;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }
}
