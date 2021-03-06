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
@Entity
@Table(name = "copies")
public class Copy extends BasicEntity {

    @Column(name = "cost")
    private Double cost;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    @ManyToOne
    @JoinColumn(name = "format_id")
    private Format format;

    @OneToMany(mappedBy = "copy")
    List<OrderDetails> orderDetailsList;

}
