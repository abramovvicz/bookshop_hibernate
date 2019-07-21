package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Getter
@Setter
@Table(name = "publisheres")
@Entity
public class Publisher extends BasicEntity {


    @OneToMany(mappedBy = "publisher")
    List<Book> bookList;
    @Column(name = "name", nullable = false, length = 100)
    private String name;
    @Column(name = "email", unique = true)
    private String email;
    @Column(name = "phone_number", unique = true)
    private int phoneNumber;
    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;


}
