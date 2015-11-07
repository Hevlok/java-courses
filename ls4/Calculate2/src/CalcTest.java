import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {


	@Test
	public void testCalc() {
		Calculator test=new Calculator();
		test.setFirst(1);
		test.setSecond(2);
		
		test.setOperation("+");				//Тест на сложение
		double resultSumm=test.calc();
		assertEquals(3,resultSumm,0.0);
		
		test.setOperation("-");				//Тест на разность
		double resultRazn=test.calc();
		assertEquals(-1,resultRazn,0.0);
			
		test.setOperation("/");				//Тест на деление
		double resultDel=test.calc();
		assertEquals(0.5,resultDel,0.0);
		
		test.setOperation("*");				//Тест на умножение
		double resultUmn=test.calc();
		assertEquals(2,resultUmn,0.0);
		
		test.setOperation("e");				//Тест на возведение в степень
		double resultPow=test.calc();
		assertEquals(1,resultPow,0.0);
		
		test.setOperation(".");				//Тест на ввод любого неверно символа операции
		double resultErr=test.calc();
		assertEquals(0,resultErr,0.0);
	}

}
