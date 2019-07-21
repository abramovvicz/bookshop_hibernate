package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "orders")
public class Order extends BasicEntity {


    @Column(name = "customer", nullable = false)
    private Customer customer;

    @Column(name = "discount")
    private int discount;


    @ManyToOne
    @JoinColumn(name="payment_id")
    private Payment payments;


    @OneToMany(mappedBy = "order")
    private List<OrderDetails> orderDetails;

}
