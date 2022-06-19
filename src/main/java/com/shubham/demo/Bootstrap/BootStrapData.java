package com.shubham.demo.Bootstrap;

import com.shubham.demo.models.Author;
import com.shubham.demo.models.Book;
import com.shubham.demo.repositories.AuthorRepository;
import com.shubham.demo.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    AuthorRepository ar;
    BookRepository br;
    BootStrapData(AuthorRepository ar, BookRepository br){
        this.ar = ar;
        this.br = br;
    }
    @Override
    public void run(String... args) throws Exception {
        Author a = new Author("Shubham", "Dogra");
        Book b = new Book("Harry Potter");
        a.getBooks().add(b);
        b.getAuthors().add(a);

        ar.save(a);
        br.save(b);

        System.out.println("[CommandLineRunner] Completed Bootstrapping");
        System.out.println("[CommandlineRunner] Count of books:" + br.count());
    }
}