package serializer;

import java.io.*;

public class EmployeeSerializer {

    public static byte[] toBinary(Employee employee) throws IOException {
        ByteArrayOutputStream bas = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(bas);
        out.writeObject(employee);
        out.flush();
        return bas.toByteArray();
    }

    public static Employee fromBinary(byte[] bytes) throws IOException, ClassNotFoundException {
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ObjectInputStream in = new ObjectInputStream(bis);
        return (Employee) in.readObject();
    }

}
