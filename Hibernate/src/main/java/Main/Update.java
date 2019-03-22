package Main;

import Entity.Author;
import org.hibernate.Session;

public class Update {
    void updateAuthor(Session session)
    {
        Author author=session.get(Author.class,1);
        author.setAge(34);
        session.update(author);
        System.out.println("updated record is"+author);
    }
}
