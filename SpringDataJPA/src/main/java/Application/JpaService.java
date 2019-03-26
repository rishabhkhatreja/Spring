package Application;

import Entity.Person;
import Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JpaService {
    @Autowired
    PersonRepository personRepository;



    //Question2 and Question3
    /*void insert(Person person) {
        personRepository.save(person);
    }

    List<Person> read() {
        return personRepository.findAll();
    }

    void delete(Integer id) {
        Person person = personRepository.findById(id);
        personRepository.delete(person);
        System.out.println("This Person is deleted from the table="+person);
    }

    void update(Integer id,Integer age)
    {
        Person person=personRepository.findById(id);
        person.setAge(age);
        personRepository.save(person);
    }
*/
    //Question4 and Question5

/*
    Person findbyFirstName(String firstName) {
        return personRepository.findByFirstName(firstName);
    }

    Person findbyLastName(String lastName) {
        return personRepository.findByLastName(lastName);
    }

    Person findbyId(Integer id) {
        return personRepository.findById(id);
    }
*/





    //Question6:
    /*List<String> findFirstNameByAge(Integer age) {
        return personRepository.findByAge(age);
    }*/





   //Question7:

    /*List<Object[]> findFirstNameAndLastNameByAge(Integer age) {
        return personRepository.findByAge(age);
    }*/


    //Question8:
     /*List<Person> findByAge(Integer age) {
         return personRepository.findByAge(age);
     }*/


    //Question9:
    /*Integer countByName(String firstName) {
        return personRepository.countByFirstName(firstName);
    }*/


    //Question11
    /*List<Person> findByAgeDesc(Integer age)
    {
        return personRepository.findByAge(age);
    }*/

    //Question12
    /*List<Person> findByAge(Integer age, Sort sort) {
        return personRepository.findByAge(age, sort);
    }*/

    //Question13:
    /*Page<Person> personPage(Pageable pageable) {
        return personRepository.findAll(pageable);
    }*/




    //Question10:
    List<Person> distinct(Integer value) {
        return personRepository.findDistinctByAge(value);

    }

    List<Person> firstNameorAge(String name, Integer age) {
        return personRepository.findByFirstNameOrAge(name, age);
    }

    List<Person> firstNameAndAge(String name, Integer age) {
        return personRepository.findByFirstNameAndAge(name, age);
    }

    List<Person> ageBetween(Integer min, Integer max) {
        return personRepository.findByAgeBetween(min, max);
    }

    List<Person> lessThan(Integer value) {
        return personRepository.findByAgeLessThan(value);
    }

    List<Person> greaterThan(Integer value) {
        return personRepository.findByAgeGreaterThan(value);
    }

    List<Person> like(String string) {
        return personRepository.findByFirstNameLike(string);
    }

    List<Person> notLike(String string) {
        return personRepository.findByFirstNameNotLike(string);
    }

    List<Person> ageIn(List<Integer> list) {
        return personRepository.findByAgeIn(list);
    }

    List<Person> ignoreCase(String string) {
        return personRepository.findByFirstNameIgnoreCase(string);
    }


}
