package sebastianslezak.springbootrest;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Employee {

    private @Id @GeneratedValue Long id;
    private String firstName;
    private String lastName;
    private int age;

    public Employee(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}
