package in.shiv;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import in.shiv.binding.Person;

public class ConvertXmlToJavaObj {
	public static void main(String[] args) throws JAXBException {
		File xmlFile=new File("Person.xml");
		JAXBContext context = JAXBContext.newInstance(Person.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Person person =(Person) unmarshaller.unmarshal(xmlFile);
		System.out.println(person);
		System.out.println("Unmarshalling completed.....");
	}

}
