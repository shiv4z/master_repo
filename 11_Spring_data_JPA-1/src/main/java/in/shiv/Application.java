package in.shiv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.shiv.entity.Book;
import in.shiv.repository.BookRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        BookRepository bean = context.getBean(BookRepository.class);	
        Book book=new Book();
        book.setBookId(111);
        book.setBookName("HC VERMA");
        book.setBookPrice(200.0);
        bean.save(book);
        System.out.println("Record inserted successfully...");
	
	}

}
