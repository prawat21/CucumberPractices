package MyHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class AmazonHooks {
	
	@Before(order = 1)
	public void setUp_browser(Scenario sc) {
		System.out.println("Launch chrome browser");
		System.out.println(sc.getName());
	}
	@Before(order = 2)
	public void setUp_url() {
		System.out.println("Launch Amazon Application: url");
	}
	
	@After(order = 2)
	public void tearDown_close(Scenario sc) {
		System.out.println("Close Amazon Application");
		System.out.println(sc.getName());
	}
	@After(order = 1)
	public void tearDown_logout() {
		System.out.println("Logout Amazon Application");
	}
	
	@BeforeStep
	public void takesScreenShot() {
		System.out.println("ScreenShot");
	}
	
	@AfterStep
	public void refreshPage() {
		System.out.println("Refresh Page");
	}
	
	
	
	
	
}
