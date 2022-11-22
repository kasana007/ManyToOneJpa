package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Author;
import com.app.model.Book;
import com.app.repo.AuthorRepository;
import com.app.repo.BookRepository;

@Component
public class InsertData implements CommandLineRunner {

	@Autowired
	private BookRepository bookrepo;
	@Autowired
	private AuthorRepository authrepo;
	
	@Override
	public void run(String... args) throws Exception {
  
		Author a1=new Author(101,"Chetan bhagat");
		Author a2=new Author(102,"Arvind Adiga");
		
		
		authrepo.save(a1);
		authrepo.save(a2);
		
		Book b1=new Book(301,"2 states",24567L,a1);
		Book b2=new Book(302,"White Tiger",12345L,a2);
		Book b3=new Book(303,"full Girlfriend",67890L,a1);
		Book b4=new Book(304,"3 Mistakes of my life",12567L,a1);
		Book b5=new Book(305,"Five point someone",23456L,a1);
		
		bookrepo.save(b1);
		bookrepo.save(b2);
		bookrepo.save(b3);
		bookrepo.save(b4);
		bookrepo.save(b5);

		
		

		
	
		
	}

}
