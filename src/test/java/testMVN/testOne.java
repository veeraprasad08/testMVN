package testMVN;

import org.testng.annotations.Test;

public class testOne {
	
	//testNG annotations are: @Test, @BeforeSuite, @AfterSuite, @BeforeClass, @AfterClass, @BeforeMethod, @AfterMethod
	
		@Test(priority=2)
	public void testLogout(){
		
		System.out.println("we are in Logout method calss 1");
		System.out.println("These my second changes in the project");
	}
		
		@Test(priority=1)
		public void testLogin(){
			
			System.out.println("we are in Login method class 1");
		}
		

	

}
