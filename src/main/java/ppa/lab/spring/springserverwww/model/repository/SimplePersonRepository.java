package ppa.lab.spring.springserverwww.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ppa.spring.domain.bean.SimplePerson;

@Repository
public interface SimplePersonRepository extends JpaRepository<Long, SimplePerson> {
    SimplePerson findBy(Long id);

    SimplePerson findBy(String firstName, String lastName);
}
