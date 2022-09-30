package NomineeModule;

import org.testng.annotations.Test;

public class addnomineedetailsTest {
	
	@Test(groups = "smoke")
	public void create()
	{
		System.out.println("----created----somke test executed");
		System.out.println("-----jenkins----");
	}
    @Test(groups = "smoke")
    public void update() 
    {
    	System.out.println("----updated----smoke test executed");
    }
    
    @Test(groups = "regression")
    public void delete()
    {
    	System.out.println("-----deleted-----regression test executed");
    }
}
