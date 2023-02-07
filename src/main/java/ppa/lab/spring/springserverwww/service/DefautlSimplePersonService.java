package ppa.lab.spring.springserverwww.service;

import org.springframework.stereotype.Service;
import ppa.lab.spring.springserverwww.model.dto.SimplePersonDto;
import ppa.lab.spring.springserverwww.model.repository.SimplePersonRepository;
import ppa.lab.spring.springserverwww.service.api.SimplePersonService;
import ppa.spring.domain.bean.SimplePerson;

@Service
public class DefautlSimplePersonService implements SimplePersonService {
    private SimplePersonRepository simplePersonRepository;

    public DefautlSimplePersonService(SimplePersonRepository simplePersonRepository) {
        this.simplePersonRepository = simplePersonRepository;
    }

    @Override public SimplePersonDto getSimplePerson(Long id) {

        SimplePerson simplePerson = simplePersonRepository.findBy(id);

        return mapSimplePerson(simplePerson);
    }

    @Override public SimplePersonDto getSimplePerson(String firstName, String lastName) {
        SimplePerson simplePerson = simplePersonRepository.findBy(firstName, lastName);

        return mapSimplePerson(simplePerson);
    }

    private SimplePersonDto mapSimplePerson (SimplePerson simplePerson) {
        SimplePersonDto simplePersonDto = new SimplePersonDto();

        simplePersonDto.setId(simplePerson.getId());
        simplePersonDto.setFirstName(simplePerson.getFirstName());
        simplePersonDto.setLastName(simplePerson.getLastName());

        return simplePersonDto;
    }
}
