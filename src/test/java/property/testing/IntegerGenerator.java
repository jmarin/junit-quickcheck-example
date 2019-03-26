package property.testing;

import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;

import java.util.Arrays;

public class IntegerGenerator extends Generator<Integer> {
    public IntegerGenerator() {
        super(Arrays.asList(Integer.class, int.class));
    }

    @Override
    public Integer generate(SourceOfRandomness random, GenerationStatus status) {
        return random.nextInt();
    }
}
