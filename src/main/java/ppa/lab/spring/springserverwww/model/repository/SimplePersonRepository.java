package ppa.lab.spring.springserverwww.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ppa.spring.domain.bean.SimplePerson;

import java.util.Optional;

@Repository
public interface SimplePersonRepository extends JpaRepository<SimplePerson, Long> {

    Optional<SimplePerson> findById(Long id);

    SimplePerson findByFirstNameAndLastName(String firstName, String lastName);
}
