package exam;

import java.security.Policy.Parameters;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameters.class)
public class TestEmployee {
	
 Employee e1;

@Before
public void initialize() {
	e1=new Employee(10, 1000.00, "name1");
}


@Parameterized.Parameters
public static Collection number() {
	
	return Arrays.asList(new Object[][] {
		{}
	});
}


@Test
public void test() {

		assertTrue(true);
		e1.tenurewiseemployee();
		e1.tenureWiseEmployeeCount();
	}


@After
public void afterexec () {
	System.out.println("test case executed");
}


}


