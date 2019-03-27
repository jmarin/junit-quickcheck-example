package serializer;

import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;

public class EmployeeGenerator extends Generator<Employee> {
    public EmployeeGenerator() {
        super(Employee.class);
    }

    @Override
    public Employee generate(SourceOfRandomness random, GenerationStatus status) {

        String firstName = "";
        String lastName = "";
        int age = new NonNegativeInts()
                .filter(x -> x < 100)
                .generate(random, status);


        String ssn = new SSNGenerator().generate(random, status);
        return new Employee(firstName, lastName, age, ssn);
    }
}
