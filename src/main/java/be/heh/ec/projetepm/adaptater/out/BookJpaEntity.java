package be.heh.ec.projetepm.adaptater.out;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "books")
public class BookJpaEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id_book")
    private Long idStudent;

    @Column(name = "titre")
    private String nom;

    @Column(name = "autheur")
    private String prenom;

    @Column(name = "price")
    private LocalDate price;

}
