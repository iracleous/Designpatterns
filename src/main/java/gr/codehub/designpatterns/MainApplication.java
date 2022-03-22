package gr.codehub.designpatterns;

import gr.codehub.designpatterns.adapter.AgentToBankAdapter;
import gr.codehub.designpatterns.adapter.DimitrisBank;
import gr.codehub.designpatterns.builder.BankCustomer;
import gr.codehub.designpatterns.factory.Person;
import gr.codehub.designpatterns.factory.PersonRepository;
import gr.codehub.designpatterns.factory.PersonType;
import gr.codehub.designpatterns.singleton.Singleton;

public class MainApplication {
    public static void main(String[] args) {

        //Singleton testing
        Singleton singleton = Singleton.getSingleton();
        System.out.println(singleton.getInfo());

        Singleton singleton2 = Singleton.getSingleton();
        System.out.println(singleton == singleton2);

        ///////////////Factory method testing//////////
        PersonRepository personRepository = new PersonRepository();

        Person person = personRepository.createPerson("Petros", "Athens", PersonType.CUSTOMER);
        System.out.println(person.getName()+" " + person.getAddress());
        System.out.println( person.getClass().getName());



        /////////Builder testing ///////////////////////////

        BankCustomer bankCustomer = new BankCustomer()
                .setId(5)
                .setLastName("Dimitriou")
                .setSalary(1000)
                .setFirstName("Nickos");

        System.out.println(bankCustomer.getSalary());

//        String myAddress = "Athens";
//        String zip = "11526";
//        String street = "Fokidos";
//
//        String totalAddress = myAddress + zip + street;
//
        StringBuilder myAddress = new StringBuilder();
        myAddress.append("Athens");
        myAddress.append("11526");


        System.out.println(myAddress.toString());



        ////////////
        //Adapter testing

        DimitrisBank dimitrisBank = new DimitrisBank(100);
        AgentToBankAdapter agentToBankAdapter = new AgentToBankAdapter(dimitrisBank);
        agentToBankAdapter.makeTransaction(-50);
        System.out.println(agentToBankAdapter.makeTransaction(0));

    }
}
