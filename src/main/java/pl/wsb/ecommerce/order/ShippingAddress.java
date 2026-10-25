package pl.wsb.ecommerce.order;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class ShippingAddress {
    @Column(name = "street", length = 80)
    private String street;

    @Column(name = "city", length = 40)
    private String city;

    @Column(name = "postal_code", length = 6)
    private String postalCode;

    protected ShippingAddress() {
    }
}
