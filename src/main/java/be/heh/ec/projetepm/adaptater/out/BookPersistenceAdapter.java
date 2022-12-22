package be.heh.ec.projetepm.adaptater.out;

import lombok.RequiredArgsConstructor;
import be.heh.ec.projetepm.port.in.BookListUseCase;
import be.heh.ec.projetepm.model.Book;

import java.util.List;


@RequiredArgsConstructor
public class BookPersistenceAdapter  implements BookListUseCase   {
    private final BookRepository bookRepository;
    private List<Book> students;

    private final BookMapper bookMapper;

    @Override
    public List<Book> getStudentList() {
        List<BookJpaEntity> bookEntity = bookRepository.findAll();
        return bookMapper.mapToDomainEntity(bookEntity);
    }
}
