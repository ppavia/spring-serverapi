package ppa.lab.spring.springserverapi.model.mock;

import ppa.spring.domain.bean.SimplePerson;

public class SimplePersonMock {

    public SimplePerson getSimplePerson() {
        SimplePerson person = new SimplePerson();
        person.setFirstName("gérard");
        person.setLastName("bouchard");
        return person;
    }
}
