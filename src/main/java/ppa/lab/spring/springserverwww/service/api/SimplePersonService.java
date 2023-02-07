package ppa.lab.spring.springserverwww.service.api;

import ppa.lab.spring.springserverwww.model.dto.SimplePersonDto;

public interface SimplePersonService {

    SimplePersonDto getSimplePerson(Long id);

    SimplePersonDto getSimplePerson(String firstName, String lastName);
}