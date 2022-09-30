package PaymentModule;

import org.testng.annotations.Test;

public class addPaymentTest {
	
	@Test(groups = "smoke")
	public void create01()
	{
		System.out.println("----created---smoke test executed");
	}
   
	@Test(groups = "smoke")
	public void update01()
	{
		System.out.println("----updaed----smoke test executed");
	}
	
	@Test(groups = "regression")
	public void delete01()
	{
		System.out.println("----deleted----Regression test executed");
	}
}
