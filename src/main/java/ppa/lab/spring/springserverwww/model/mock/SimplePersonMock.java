package ppa.lab.spring.springserverwww.model.mock;

import ppa.spring.domain.bean.SimplePerson;

public class SimplePersonMock {

    public SimplePerson getSimplePerson() {
        SimplePerson person = new SimplePerson();
        person.setFirstName("gérard");
        person.setLastName("bouchard");
        return person;
    }
}
