import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {


	@Test
	public void testCalc() {
		Calculator test=new Calculator();
		test.setFirst(1);
		test.setSecond(2);
		test.setOperation("*");
		double result=test.calc();
		assertEquals(2.0,result,0.0);
	}

}
