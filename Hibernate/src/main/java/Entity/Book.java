package Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/*
Question14:Create an Entity book with an instance variable bookName.
 */

@Entity
public class Book {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    private String bookName;


    //this is Question16 bidirectional
   /* @ManyToOne
    Author author;
*/
  /*  public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
*/



  //This is Question16:many to many
    @ManyToMany(mappedBy = "book")
    List<Author> authors=new ArrayList<>();


    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
