import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {


	@Test
	public void testCalc() {
		Calculator test=new Calculator();
		test.setFirst(1);
		test.setSecond(2);
		test.setOperation("к");
		double result=test.calc();
		assertEquals(0,result,0.0);
	}

}
