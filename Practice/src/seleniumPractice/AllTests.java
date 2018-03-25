package seleniumPractice;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ Ex_JunitTestCase.class, Google.class, Registration.class,
		Registration1.class })
public class AllTests {

}
