package model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "payments")  //ustawianie nazwy tabelki w bazie
public class Payment extends BasicEntity {

    @Column(name = "name", length = 40) //varchar 40 nullable
    private String name;

    @Column(name = "code", length = 40, unique = true) //varchar 40 nullable
    @Enumerated(EnumType.STRING)
    private PaymentCode code;

    @OneToMany(mappedBy = "payment")
    private List<Order> ordersList;
}
