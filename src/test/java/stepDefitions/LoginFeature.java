package stepDefitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginFeature {

	WebDriver driver = null;

	@Given("user has launched chrome browser")

	public void user_has_launched_chrome_browser() {

		// Write code here that turns the phrase above into concrete actions

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Given("navigated to bookmyshow.com")
	public void navigated_to_facebook_com() {
		// Write code here that turns the phrase above into concrete actions
		driver.get("https://in.bookmyshow.com/explore/movies");
	}

	@Then("verified title")
	public void verified_title() {
		// Write code here that turns the phrase above into concrete actions
		String title = driver.getTitle();
		System.out.println("Actual Title: " + title);
	}

	@Then("quit browser")
	public void quit_browser() {

		driver.quit();
	}
}
