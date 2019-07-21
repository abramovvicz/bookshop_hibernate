package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;


@Getter
@Setter
@Entity
@Table(name = "categories")  //ustawianie nazwy tabelki w bazie
public class Category extends BasicEntity {


    @OneToMany(mappedBy = "category")
    List<Book> booksList;

    @Column(name = "name", nullable = false, length = 40) //varchar 40 nullable
    private String name;

    @Column(name = "code", nullable = false, unique = true, length = 40)
    @Enumerated(EnumType.STRING)
    private CategoryCode code;


}
