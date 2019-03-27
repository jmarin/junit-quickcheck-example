package serializer;

import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;

public class SSNGenerator extends Generator<String> {
    public SSNGenerator() {
        super(String.class);
    }

    @Override
    public String generate(SourceOfRandomness random, GenerationStatus status) {
        String ss1 = Integer.toString(random.nextInt(9));
        String ss2 = Integer.toString(random.nextInt(9));
        String ss3 = Integer.toString(random.nextInt(9));

        String ss4 = Integer.toString(random.nextInt(9));
        String ss5 = Integer.toString(random.nextInt(9));

        String ss6 = Integer.toString(random.nextInt(9));
        String ss7 = Integer.toString(random.nextInt(9));
        String ss8 = Integer.toString(random.nextInt(9));
        String ss9 = Integer.toString(random.nextInt(9));

        return ss1 + ss2 + ss3 + "-" + ss4 + ss5 + "-" + ss6 + ss7 + ss8 + ss9;
    }
}
