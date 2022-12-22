package be.heh.ec.projetepm;

import be.heh.ec.projetepm.adaptater.out.BookMapper;
import be.heh.ec.projetepm.adaptater.out.BookPersistenceAdapter;
import be.heh.ec.projetepm.adaptater.out.BookRepository;
import be.heh.ec.projetepm.port.in.BookListUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetEpmApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjetEpmApplication.class, args);
    }

}
