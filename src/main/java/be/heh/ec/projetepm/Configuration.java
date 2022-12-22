package be.heh.ec.projetepm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import be.heh.ec.projetepm.adaptater.out.BookMapper;
import be.heh.ec.projetepm.adaptater.out.BookPersistenceAdapter;
import be.heh.ec.projetepm.adaptater.out.BookRepository;
import be.heh.ec.projetepm.port.in.BookListUseCase;

@org.springframework.context.annotation.Configuration
@EnableJpaRepositoriespublic
class Configuration {
    @Autowired
    private BookRepository bookRepository;

    private BookMapper bookMapper = new BookMapper();

    @Bean
    BookListUseCase getStudentListUseCase(){

        return new BookPersistenceAdapter(bookRepository,bookMapper);
    }
}
