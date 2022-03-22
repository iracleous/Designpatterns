package gr.codehub.designpatterns.factory;

import java.util.ArrayList;
import java.util.List;

public class PersonRepository {

    private List<Person> persons = new ArrayList<>();


    public Person createPerson( String name, String address, PersonType personType){
        Person person;
        switch(personType) {
            case EMPLOYEE:
                person = new Employee();
                break;
            case CUSTOMER:
                person = new Customer();
                break;
            default:
                throw new Error("Unsupported enumeration");
        }
        person.setName(name);
        person.setAddress(address);
        return person;
    }
}
