package HotelLogin;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import pageBean.HotelBookingPageFactory;
import pageBean.HotelLoginPageFactory;

public class stepdeflogin {
	private WebDriver driver;
	private HotelLoginPageFactory objhlpg;
	

	@Given("^User is on login page$")
	public void user_is_on_login_page() throws Throwable {
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		objhlpg = new HotelLoginPageFactory(driver);
		driver.get("file:///D:/hotel%20booking/hotelBooking/login.html");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^check the heading of the age$")
	public void check_the_heading_of_the_age() throws Throwable {
		String strheading = driver.findElement(By.xpath("//*[@id='mainCnt']/div/div[1]/h1")).getTagName();
		if(strheading.contentEquals("Hotel Booking Application")) {
			System.out.println("*****" + "Heading Matched");
		}
		else {
			System.out.println("*****" + "Heading Not Matched");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.close();
		}
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}

	@When("^user enters valid username, valid password$")
	public void user_enters_valid_username_valid_password() throws Throwable {
		objhlpg.setPfuname("capgemini");
		objhlpg.setPfpwd("capg1234");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		objhlpg.setPflogin();
		driver.close();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}

	@Then("^navigate to hotel booking$")
	public void navigate_to_hotel_booking() throws Throwable {
		driver.navigate().to("file:///D:/hotel%20booking/hotelBooking/hotelbooking.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.close();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^user doesnot enter either username or password$")
	public void user_doesnot_enter_either_username_or_password() throws Throwable {
		objhlpg.setPfuname("");
		Thread.sleep(1000);
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}

	@When("^clicks the Login Button$")
	public void clicks_the_Login_Button() throws Throwable {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		objhlpg.setPflogin();
		Thread.sleep(1000);
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^display appropriate message$")
	public void display_appropriate_message() throws Throwable {
		String strheading = driver.findElement(By.xpath(".//*[@id='userErrMsg']")).getText();
		assertEquals(strheading, "* Please enter userName.");
		driver.close();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^user enters incorrect username or password$")
	public void user_enters_incorrect_username_or_password() throws Throwable {
		objhlpg.setPfuname("cg");
		objhlpg.setPfpwd("capg1234");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}

	@Then("^display login failed message$")
	public void display_login_failed_message() throws Throwable {
		objhlpg.setPflogin();
		String alertMessage = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println("****" + alertMessage);
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}


	
}
