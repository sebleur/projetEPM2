package be.heh.ec.projetepm.adaptater.out;

import be.heh.ec.projetepm.model.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
public class BookMapper {

    List<Book> mapToDomainEntity(List<BookRepository> students){
        List<Book> booksList = new ArrayList<>();

        for (BookJpaEntity bookJpaEntity: book) {
            booksList.add(new Book(bookJpaEntity.getTitre(),bookJpaEntity.getAutheur(),bookJpaEntity.getPrice()));
        }
        return booksList;
    }
}
