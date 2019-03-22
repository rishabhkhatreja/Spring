package Main;

import Entity.Author;
import org.hibernate.Session;

public class Read {
    public Author readAuthor(Session session)
    {
        Author author=session.get(Author.class,1);
        return author;
    }
}
