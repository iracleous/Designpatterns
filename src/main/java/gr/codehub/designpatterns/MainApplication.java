package gr.codehub.designpatterns;

import gr.codehub.designpatterns.factory.Person;
import gr.codehub.designpatterns.factory.PersonRepository;
import gr.codehub.designpatterns.factory.PersonType;
import gr.codehub.designpatterns.singleton.Singleton;

public class MainApplication {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        System.out.println(singleton.getInfo());

        Singleton singleton2 = Singleton.getSingleton();
        System.out.println(singleton == singleton2);

        //////////////////////////////////////////////
        PersonRepository personRepository = new PersonRepository();

        Person person = personRepository.createPerson("Petros", "Athens", PersonType.CUSTOMER);
        System.out.println(person.getName()+" " + person.getAddress());
        System.out.println( person.getClass().getName());
    }
}
