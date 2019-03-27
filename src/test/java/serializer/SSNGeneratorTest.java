package serializer;

import com.pholser.junit.quickcheck.From;
import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.runner.RunWith;

import static org.hamcrest.junit.MatcherAssert.assertThat;
import static org.hamcrest.text.MatchesPattern.matchesPattern;

@RunWith(JUnitQuickcheck.class)
public class SSNGeneratorTest {

    @Property
    public void testSSNGenerator(@From(SSNGenerator.class) String ssn) {
        //System.out.println(ssn);
        assertThat(ssn, matchesPattern("(^\\d{3}-?\\d{2}-?\\d{4}$|^XXX-XX-XXXX$)"));
    }
}
