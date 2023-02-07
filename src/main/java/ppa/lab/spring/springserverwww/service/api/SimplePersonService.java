package ppa.lab.spring.springserverwww.service.api;

import ppa.lab.spring.springserverwww.model.dto.SimplePersonDto;

import java.util.Optional;

public interface SimplePersonService {

    Optional<SimplePersonDto> getSimplePerson(Long id);

    SimplePersonDto getSimplePerson(String firstName, String lastName);
}