package testCases;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	
	@Test
	public void login()
	{
		lp.logInToApp();
	}

}
