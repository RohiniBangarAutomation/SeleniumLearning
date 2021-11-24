package JUnit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({JUnitLearn.class,DemoClass.class,Demo2.class,MathOperator.class})
public class Runner {

}
