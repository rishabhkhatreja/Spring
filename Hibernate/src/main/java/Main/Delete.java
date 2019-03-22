package Main;

import Entity.Author;
import org.hibernate.Session;

public class Delete {
    public void deleteAuthor(Session session)
    {
        Author author=session.get(Author.class,1);
        session.delete(author);
        System.out.println("deleted author is"+author);
    }
}
