package be.heh.ec.projetepm.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;


@RequiredArgsConstructor
public class Book {

    @Getter
    private final String titre;
    @Getter
    private final String autheur;
    @Getter
    private final int price;


}
