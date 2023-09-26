package in.shiv;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import in.shiv.binding.Author;
import in.shiv.binding.Book;

public class ConvertJavaObjToJson {
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {

		Author author = new Author();
		author.setName("Mohan Ranga");
		author.setAge(48);
		author.setContact("566456464");
		Book book = new Book();
		book.setBid(101);
		//book.setName("HC Verma");
		book.setPrice(400.0);
		book.setAuthor(author);
		
		
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.writeValue(new File("Book.json"), book);
		
		System.out.println("Json conversion completed..");
	}

}
