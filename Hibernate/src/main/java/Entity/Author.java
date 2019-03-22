package Entity;


import javax.persistence.*;
import java.util.*;

/*
Question1:Create a class Author with instance variables firstName, lastName and age.
 */


@Entity
public class Author {


    /*
    Question9:Generate Id for Author Using IDENTITY and TABLE starategy.
    GenerationType.Table in this seperate table is made which stores primary key values...
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    //Question6:Rename all the fields using column annotation....
    /*
    Original column name is firstname but we can change or provide alias name by using @column annotation..Now table
    will have column as First_Name not firstName
     */
    @Column(name = "First_Name")
    private String firstName;

    //Question7: Mark lastName as @Transient...
    // Transient mean lastname will not be included in the Author table
    @Transient
    private String lastName;

    @Column(name = "Age")
    private Integer age;

    //Question8:Use @Temporal for date of birth of Author.
    @Temporal(value = TemporalType.DATE)
    private Date dob;


    /*
    Question10:Create a class Address for Author with instance variables streetNumber, location, State.
    Question11:Create instance variable of Address class inside Author class and save it as embedded object.
     */
    @Embedded
    private Address address;


    /*
    Question15:Implement One to One mapping between Author and Book.

         uncomment oneToone block and getter and setter below
     */
    /*@OneToOne
    @JoinColumn(name = "Book_Id")
    private Book book;
    */


    /*
    Question16:Implement One to Many Mapping between Author and Book(Unidirectional, BiDirectional and without additional table ) and  implement cascade save.
     */



    //this is for unidirection and bidirectional
    /*@OneToMany
    @JoinTable(joinColumns = @JoinColumn(name = "Author_ID")
            , inverseJoinColumns = @JoinColumn(name = "Book_ID"))*/

    /*

    //this is without extra table
    @OneToMany(mappedBy = "author")
    Collection<Book> book = new HashSet<Book>();
    */


    @ManyToMany
    List<Book> book = new ArrayList<>();

    public List<Book> getBook() {
        return book;
    }

    public void setBook(List<Book> book) {
        this.book = book;
    }
     /*
     Question12:Introduce a List of subjects for author.
     */

    @ElementCollection
    Set<String> subject = new HashSet<>();


    public Set<String> getSubject() {
        return subject;
    }

    public void setSubject(Set<String> subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", dob=" + dob +
                ", address=" + address +
                ", book=" + book +
                ", subject=" + subject +
                '}';
    }

   /* public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }*/



    public Date getDob() {
        return dob;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
