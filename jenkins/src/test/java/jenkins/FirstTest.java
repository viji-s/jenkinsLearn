package jenkins;

import org.testng.annotations.Test;

import base.BaseClass;

public class FirstTest extends BaseClass{
	
	@Test
	public void getTitle() {
		System.out.println(driver.getTitle());
	}

}
