package be.heh.ec.projetepm.adaptater.out;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookRepository extends JpaRepository<BookJpaEntity,Long> {
}
