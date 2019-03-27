package serializer;

import java.io.Serializable;
import java.util.Objects;

public class Employee implements Serializable {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String ssn;

    public Employee(String firstName, String lastname, int age, String ssn) {
        this.firstName = firstName;
        this.lastName = lastname;
        this.age = age;
        this.ssn = ssn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age &&
                firstName.equals(employee.firstName) &&
                lastName.equals(employee.lastName) &&
                ssn.equals(employee.ssn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, ssn);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}
