package testMVN;

import org.testng.annotations.Test;

public class testAnnotations2 {
	
	//testNG annotations are: @Test, @BeforeSuite, @AfterSuite, @BeforeClass, @AfterClass, @BeforeMethod, @AfterMethod
	
		@Test(priority=2)
	public void testLogout(){
		
		System.out.println("we are in Logout method of class2");
		System.out.println("I have done some chnages here");
		System.out.println("these are my third changes");
	}
		
		@Test(priority=1)
		public void testLogin(){
			
			System.out.println("we are in Login method of class2");
		}
		

	

}
