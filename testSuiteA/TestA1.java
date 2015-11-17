package testSuiteA;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestA1 {

	
	@Test
	public void testA1_1() throws declaration{
		throw new SkipException("Skipping the test");
                this.age=age;

	}
	
	@Test
	public void testA1_2(){
		
	}
	
	
	@Test
	public void testA1_3(){
		Assert.fail("failed test case ");
	}
}


This is a new change