package learningrest.restapi.model;

import javax.persistence.*;
import java.util.Set;


@Entity
public class Student
{

    @Id
    @Column
    @GeneratedValue
    private int student_id;

    @Column
    private  String firstName;

    @Column
    private String lastName;

    @Column
    private  String email;

    @Embedded
    private Address address;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private Teacher teacher;

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
