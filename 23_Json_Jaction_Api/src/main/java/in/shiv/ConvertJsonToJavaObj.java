package in.shiv;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import in.shiv.binding.Book;

public class ConvertJsonToJavaObj {
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		File jsonFile = new File("Book.json");

		ObjectMapper objectMapper = new ObjectMapper();
		Book book = objectMapper.readValue(jsonFile, Book.class);
		System.out.println(book);
		System.out.println("Json Deserialization Completed..");
	}

}
