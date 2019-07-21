package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.List;


@Entity
@Setter
@Getter
@Table(name = "authors")
public class Author extends BasicEntity {

    @Column(name = "first_name", nullable = false, length = 40)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 40)
//    @Column(columnDefinition = "last_name varchar(40) not null") //można też tak bardziej SQLowo ale to nie fajne jest
    private String lastName;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name = "sex", length = 1)
    @Enumerated(EnumType.STRING)
    // takie mapowanie na stringa bo bez tego bylo by tak ze M bylo by rowne 1 a F bylo by rowne 2 w tabeli
    private Sex sex;


    @JoinTable(name = "authors_books",
            joinColumns = @JoinColumn(name = "author_id"),
            inverseJoinColumns = @JoinColumn(name = "book_id"))
    @ManyToMany
    private List<Book> books;
}
