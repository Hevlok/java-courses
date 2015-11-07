import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {


	@Test
	public void testCalc() {
		Calculator test=new Calculator();
		test.setFirst(1);
		test.setSecond(2);
		
		test.setOperation("+");
		double resultSumm=test.calc();
		assertEquals(3,resultSumm,0.0);
		
		test.setOperation("-");
		double resultRazn=test.calc();
		assertEquals(-1,resultRazn,0.0);
		
		test.setOperation("/");
		double resultDel=test.calc();
		assertEquals(0.5,resultDel,0.0);
		
		test.setOperation("*");
		double resultUmn=test.calc();
		assertEquals(2,resultUmn,0.0);
		
		test.setOperation("e");
		double resultPow=test.calc();
		assertEquals(1,resultPow,0.0);
		
		test.setOperation(".");
		double resultErr=test.calc();
		assertEquals(0,resultErr,0.0);
	}

}
