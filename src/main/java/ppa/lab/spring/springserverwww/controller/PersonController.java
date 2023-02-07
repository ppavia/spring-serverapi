package ppa.lab.spring.springserverwww.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ppa.lab.spring.springserverwww.model.dto.SimplePersonDto;
import ppa.lab.spring.springserverwww.service.api.SimplePersonService;

@RestController
@RequestMapping("/person")
public class PersonController {
    private SimplePersonService simplePersonService;

    public PersonController(SimplePersonService simplePersonService) {
        this.simplePersonService = simplePersonService;
    }

    @GetMapping("/{firstName}/{lastName}")
    public SimplePersonDto person(
            @RequestParam("firstName") String firstName
            ,@RequestParam("lastName") String lastName
    ) {
        return simplePersonService.getSimplePerson(firstName, lastName);
    }
}
