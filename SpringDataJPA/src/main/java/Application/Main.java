package Application;

import Configuration.PersistenceContext;
import Entity.Person;
import Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {
        ConfigurableApplicationContext ctx=new AnnotationConfigApplicationContext(PersistenceContext.class);
        JpaService bean = ctx.getBean(JpaService.class);



        //---------------------Question2AndQuestion3-------------------------:

        //Create

        /*Person person=new Person();
        person.setAge(23);
        person.setFirstName("Rishabh");
        person.setLastName("Khatreja");
        person.setSalary(2000);
        bean.insert(person);*/

        //Read

        /*List<Person> read = bean.read();
        System.out.println(read);*/


        //update

        /*bean.update(6,26);*/

        //Delete

        //bean.delete(5);

        //--------------------Question4AndQuestion5---------------------------------
/*
        System.out.println("findbyId="+bean.findbyId(8));
        System.out.println("findbyFirstName="+bean.findbyFirstName("Rishabh"));
        System.out.println("findbyLastName="+bean.findbyLastName("pathak"));
*/





        //---------------------------Question6---------------------------------------

/*
        System.out.println(" fetch firstname of the Person whose age is 25="+bean.findFirstNameByAge(25));
*/




        //--------------------------Question7---------------------------------------

/*
        System.out.println("Use @Query to fetch firstname and lastname of the Person whose age is 25=");

        List<Object[]> results = bean.findFirstNameAndLastNameByAge(25);

        for (Object[] result : results) {
            System.out.println("First Name="+(String) result[0]);
            System.out.println("Last Name="+(String) result[1]);
        }
*/


        //--------------------------Question8-----------------------------------------

/*
        System.out.println("Get complete information of the Employee whose age is 25 using @Query="+bean.findByAge(25));
*/




        //--------------------------Question9-----------------------------------------

/*
        System.out.println("Count Person where name is \"Peter\" using @Query="+bean.countByName("Rishabh"));
*/



/*
        --------------------------Question10:-----------------------------------------
        count
        distinct
        or
        and
        between
        LessThan
        GreaterThan
        Like
        Not
        In
        IgnoreCase*/

        List<Integer> list1=new ArrayList<>();
        list1.add(25);
        list1.add(27);
        list1.add(20);
        System.out.println("Distinct="+bean.distinct(25));
        System.out.println("or="+bean.firstNameorAge("Rishabh",25));
        System.out.println("and="+bean.firstNameAndAge("Rishabh",23));
        System.out.println("Between="+bean.ageBetween(25,30));
        System.out.println("LessThan="+bean.lessThan(25));
        System.out.println("GreaterThan="+bean.greaterThan(25));
        System.out.println("Like="+bean.like("R%"));
        System.out.println("Not="+bean.notLike("R%"));
        System.out.println("In="+bean.ageIn(list1));
        System.out.println("Ignore Case="+bean.ignoreCase("rishabh"));






        //---------------------------Question11--------------------------------------------------

/*
         System.out.println("Get the persons greater than age 25 and sort them in descending order according to id by method query."+bean.findByAgeDesc(25));
*/





        //------------------------------Question12------------------------------------------------


/*
        List<Person> list = bean.findByAge(25,new Sort(Sort.Direction.DESC,"id"));
        System.out.println(list);

*/

        //-----------------------------Question13-------------------------------------------------



/*
        Page<Person> id=bean.personPage(new PageRequest(0, 3));
        List<Person> content = id.getContent();
        System.out.println("total number of pages="+id.getTotalPages());
        System.out.println("content in the pages are"+content);
*/




    }
}
