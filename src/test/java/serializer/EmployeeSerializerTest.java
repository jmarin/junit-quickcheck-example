package serializer;

import com.pholser.junit.quickcheck.From;
import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.runner.RunWith;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static serializer.EmployeeSerializer.toBinary;

@RunWith(JUnitQuickcheck.class)
public class EmployeeSerializerTest {

    @Property
    public void personSerDe(@From(EmployeeGenerator.class) Employee employee) {
        System.out.println(employee);

        try {
            byte[] bytes = EmployeeSerializer.toBinary(employee);
            Employee deserialized = EmployeeSerializer.fromBinary(bytes);
            assertEquals(deserialized, employee);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
