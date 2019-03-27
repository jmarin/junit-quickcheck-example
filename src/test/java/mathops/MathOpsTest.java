package mathops;

import com.pholser.junit.quickcheck.From;
import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitQuickcheck.class)
public class MathOpsTest {

    @Property
    public void sumCommutativity (
            @From(IntegerGenerator.class) int a,
            @From(IntegerGenerator.class) int b) {
        //System.out.println(a + ", " + b);
        assertEquals(
                MathOps.sum(a, b),
                MathOps.sum(b, a)
        );
    }

    @Property
    public void sumAssociativity(
            @From(IntegerGenerator.class) int a,
            @From(IntegerGenerator.class) int b,
            @From(IntegerGenerator.class) int c
    ) {
        //System.out.println(a + ", " + b + ", " + c);
        assertEquals(
                MathOps.sum(MathOps.sum(a,b), c),
                MathOps.sum(a, MathOps.sum(b, c))
        );
    }

    @Property
    public void sumIdentity(
            @From(IntegerGenerator.class) int a
    ) {
        assertEquals(
                MathOps.sum(a, 0),
                a
        );
    }

    @Property
    public void multiplyCommutativity(
            @From(IntegerGenerator.class) int a,
            @From(IntegerGenerator.class) int b) {

        assertEquals(
                MathOps.multiply(a, b),
                MathOps.multiply(b, a)
        );
    }

    @Property
    public void multiplyAssociativity(
            @From(IntegerGenerator.class) int a,
            @From(IntegerGenerator.class) int b,
            @From(IntegerGenerator.class) int c
    ) {
        //System.out.println(a + ", " + b + ", " + c);
        assertEquals(
                MathOps.multiply(MathOps.multiply(a,b), c),
                MathOps.multiply(a, MathOps.multiply(b, c))
        );
    }


    @Property
    public void multiplyIdentity(
            @From(IntegerGenerator.class) int a
    ) {
        assertEquals(
                MathOps.multiply(a, 1),
                a
        );
    }

}
