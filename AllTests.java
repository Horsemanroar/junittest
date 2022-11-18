package junittestpackage;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ junittestcase.class, testaddnumbers.class })
public class AllTests {

}
