package serializer;

import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;

public class EmployeeGenerator extends Generator<Employee> {

    private static final String[] FIST_NAMES = new String[]{
            "Joe", "Andy", "Vivian", "Amy", "Rodolfo", "Mary"
    };


    private static final String[] LAST_NAMES = new String[]{
            "Garcia", "Smith", "Doe", "Simpson", "Snow"
    };

    public EmployeeGenerator() {
        super(Employee.class);
    }

    @Override
    public Employee generate(SourceOfRandomness random, GenerationStatus status) {

        String firstName = FIST_NAMES[random.nextInt(6)];
        String lastName = LAST_NAMES[random.nextInt(5)];
        int age = new NonNegativeInts()
                .filter(x -> x < 100)
                .generate(random, status);


        String ssn = new SSNGenerator().generate(random, status);
        return new Employee(firstName, lastName, age, ssn);
    }
}
