package in.shiv;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import in.shiv.binding.Address;
import in.shiv.binding.Person;

public class ConvertJavaToXml {
	public static void main(String[] args) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Person.class);

		Person person = new Person();
		person.setAge(22);
		person.setContact(121312131L);
		person.setName("Shiv");
		person.setPid(11);
		person.setGender("Male");

		Address address = new Address();
		address.setCity("Varanasi");
		address.setState("UP");
		address.setCountry("India");

		person.setAddress(address);

		Marshaller marshaller = context.createMarshaller();
		marshaller.marshal(person, new File("Person.xml"));

		System.out.println("Marshalling successfull..");
	}

}
