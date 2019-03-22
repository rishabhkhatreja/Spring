package Main;

import Entity.Address;
import Entity.Author;
import Entity.Book;
import org.hibernate.Session;

import java.util.*;

public class Create {
    void createAuthor(Session session)
    {
        Author author=new Author();
        author.setFirstName("Rishabh");
        author.setLastName("khatreja");
        author.setAge(23);
        author.setId(1);
        author.setDob(new Date(1995,03,03));
        Set<String> subject=new HashSet<>();//Question13:Persist 3 subjects for each author.
        subject.add("maths");
        subject.add("english");
        subject.add("science");
        author.setSubject(subject);
        Address address=new Address();
        address.setLocation("Shalimar bagh");
        address.setStreetNumber(93);
        address.setState("Delhi");
        author.setAddress(address);

        Author author1=new Author();
        author1.setFirstName("Rohan");
        author1.setLastName("mehra");
        author1.setAge(25);
        author1.setId(2);
        author1.setDob(new Date(1995,12,15));
        Set<String> subject1=new HashSet<>();//Question13:Persist 3 subjects for each author.
        subject1.add("maths");
        subject1.add("english");
        subject1.add("science");
        author1.setSubject(subject1);
        Address address1=new Address();
        address1.setLocation("Rohini");
        address1.setStreetNumber(22);
        address1.setState("Delhi");
        author1.setAddress(address1);
        List<Author> authorList=new ArrayList<>();
        authorList.add(author);
        authorList.add(author1);


        Book book=new Book();
        book.setBookName("programming with c");

        Book book1=new Book();
        book1.setBookName("programming with java");

        List<Book> bookList=new ArrayList<>();
        bookList.add(book);
        bookList.add(book1);

        author.setBook(bookList);
        author1.setBook(bookList);

        book.setAuthors(authorList);
        book1.setAuthors(authorList);
        //This commemented part is for Question15 one to many ,bidirectional,unidirectional
        /*Book book =new Book();
        book.setBookName("Programming with C");
        book.setAuthor(author);
        author.getBook().add(book);
        Book book1 =new Book();
        book1.setBookName("Programming with java");
        book1.setAuthor(author);
        author.getBook().add(book1);*/
        session.save(author);
        session.save(author1);
        session.save(book);
        session.save(book1);
    }
}
