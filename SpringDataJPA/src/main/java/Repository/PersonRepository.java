package Repository;

import Entity.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonRepository extends CrudRepository<Person, Integer> {

    //Question2 and Question3


    /*Person save(Person person);
    List<Person> findAll();
    void delete(Person person);
*/
    //Question4 and Question5
/*
    Person findById(Integer id);
    Person findByFirstName(String firstName);
    Person findByLastName(String lastName);
*/


    //Question6

    /*@Query("SELECT firstName from Person where age=:age")
    List<String> findByAge(@Param("age") Integer age);
*/

    //Question7

    /*@Query("SELECT firstName,lastName from Person where age=:age")
    List<Object[]> findByAge(@Param("age") Integer age);
*/
    //Question8
/*
  @Query("SELECT e from Person e where age=:age")
    List<Person> findByAge(@Param("age") Integer age);
*/





  //Question9

/*
    @Query("SELECT count(e) from Person e where firstName=:firstName")
    Integer countByFirstName(@Param("firstName") String firstName);
*/

    //Question11:Get the persons greater than age 25 and sort them in descending order according to id by method query.
/*
    @Query("SELECT e from Person e where age=:age order by id desc")
    List<Person> findByAge(@Param("age") Integer age);
*/



   //Question12:above Question using the Sort class


/*
    @Query("SELECT e from Person e where age=:age")
    List<Person> findByAge(@Param("age") Integer age, Sort sort);
*/


    //Question13:Apply Pagination on Person entities.

/*
    Page<Person> findAll(Pageable pageable);
*/


    /*Question10:Implement following methods for Person repository:
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

    //distinct
    List<Person> findDistinctByAge(Integer value);

    //or
    List<Person> findByFirstNameOrAge(String name, Integer age);

    //and
    List<Person> findByFirstNameAndAge(String name, Integer age);

    //between
    List<Person> findByAgeBetween(Integer min, Integer max);

    //lessThan
    List<Person> findByAgeLessThan(Integer age);

    //Greater than
    List<Person> findByAgeGreaterThan(Integer age);

    //Like
    List<Person> findByFirstNameLike(String name);

    //Not
    List<Person> findByFirstNameNotLike(String name);

    //In
    List<Person> findByAgeIn(List<Integer> ageList);

    //IgnoreCase
    List<Person> findByFirstNameIgnoreCase(String name);

}
