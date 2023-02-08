package ppa.lab.spring.springserverwww.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ppa.lab.spring.springserverwww.exception.RestException;
import ppa.lab.spring.springserverwww.exception.RestResponseBean;
import ppa.lab.spring.springserverwww.exception.ServiceException;
import ppa.lab.spring.springserverwww.model.dto.SimplePersonDto;
import ppa.lab.spring.springserverwww.service.api.SimplePersonService;
import ppa.lab.spring.springserverwww.utils.HttpResponseUtil;

@RestController
@RequestMapping("/person")
public class PersonController {
    private static final Logger LOG = LoggerFactory.getLogger(PersonController.class);
    private SimplePersonService simplePersonService;

    public PersonController(SimplePersonService simplePersonService) {
        this.simplePersonService = simplePersonService;
    }

    @GetMapping("/{firstName}/{lastName}")
    public ResponseEntity<RestResponseBean<SimplePersonDto>> person(
            @PathVariable("firstName") String firstName
            ,@PathVariable("lastName") String lastName
    ) throws RestException {
        SimplePersonDto simplePerson = null;
        try {
            simplePerson = simplePersonService.getSimplePerson(firstName, lastName);
        } catch (ServiceException e) {
            LOG.error(e.getMessage(), e);
            throw new RestException(e.getMessage(), HttpStatus.NOT_FOUND);
        }
        return HttpResponseUtil.buildUTF8ResponseBean(simplePerson, "", "person.endpoint", "find person");
    }

    @GetMapping("/400")
    public ResponseEntity<Void> noPerson() throws RestException {
        throw new RestException("a bad request", HttpStatus.NOT_FOUND);
    }
}
