package serializer;


import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;

import java.util.Arrays;

public class NonNegativeInts extends Generator<Integer> {
    public NonNegativeInts() {
        super(Arrays.asList(Integer.class, int.class));
    }

    @Override public Integer generate(
            SourceOfRandomness random,
            GenerationStatus status) {

        return Math.abs(random.nextInt());
    }
}