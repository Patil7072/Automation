package Test_Ng;

import org.testng.annotations.Test;

public class Priority_Demo 
{
	@Test(priority = 1)
	public void add()
	{
		System.out.println("Add Method");
	}
	
	@Test(priority = 2)
	public void sub()
	{
		System.out.println("Sub Method");
	}
	
	@Test(priority = -3)
	public void mul()
	{
		System.out.println("Mul Method");
	}
	
	@Test(priority = -4)
	public void div()
	{
		System.out.println("div Method");
	}
	
	@Test
	public void test()
	{
		System.out.println("Test Method");
	}

}
