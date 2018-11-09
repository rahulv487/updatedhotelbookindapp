package HotelBooking;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageBean.HotelBookingPageFactory;
//import pageBean.HotelLoginPageFactory;

public class stepdefbooking {
	
	private WebDriver driver;
	//private HotelLoginPageFactory objhlpg;
	private HotelBookingPageFactory objhbkg;
	@Given("^User is on hotel booking page$")
	public void user_is_on__hotel_booking_page() throws Throwable {
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		objhbkg = new HotelBookingPageFactory(driver);
		driver.get("file:///D:/hotel%20booking/hotelBooking/hotelbooking.html");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}
	
	
	@Then("^check the heading of page$")
	public void check_the_heading_of_page() throws Throwable {
		String strheading = driver.findElement(By.xpath("html/body/div[1]/h2")).getTagName();
		if(strheading.contentEquals("Hotel Booking Form")) {
			System.out.println("*****" + "Heading Matched");
		}
		else {
			System.out.println("*****" + "Heading Not Matched");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.close();
		}
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	

	@When("^user enters all valid data$")
	public void user_enters_all_valid_data() throws Throwable {
		    driver.manage().window().maximize();
			objhbkg.setPfname("Rahul");Thread.sleep(3000);
			objhbkg.setPflname("capg1234");Thread.sleep(3000);
			objhbkg.setPfemail("rahul@capgemini.com");Thread.sleep(3000);
			objhbkg.setPfphoneno("9090876543");Thread.sleep(3000);
			objhbkg.setPfcity("Pune");Thread.sleep(3000);
			objhbkg.setPfstate("Maharashtra");Thread.sleep(3000);
			objhbkg.setPersons("1");Thread.sleep(3000);
			objhbkg.setCardholderName("Rahulv");Thread.sleep(3000);
			objhbkg.setTxtDebit("9809765645326756");Thread.sleep(3000);
			objhbkg.setTxtCvv("907");Thread.sleep(3000);
			objhbkg.setMonth("09");Thread.sleep(3000);
			objhbkg.setTxtYear("2020");
			//Thread.sleep(30000);
			
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			objhbkg.setBtnPayment();
			Thread.sleep(3000);
			//Thread.sleep(30000);
			
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}

	@Then("^navigate to welcome page$")
	public void navigate_to_welcome_page() throws Throwable {
		//driver=new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//objhbkg = new HotelBookingPageFactory(driver);
		driver.navigate().to("file:///D:/hotel%20booking/hotelBooking/success.html");
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		driver.quit();
	}

	@When("^user leaves first name blank$")
	public void user_leaves_first_name_blank() throws Throwable {
		driver.manage().window().maximize();
		objhbkg.setPfname("");Thread.sleep(3000);
		//objhbkg.setBtnPayment();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}

	@When("^clicks the button$")
	public void clicks_the_button() throws Throwable {
		objhbkg.setBtnPayment();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^display alert msg$")
	public void display_alert_msg() throws Throwable {
		Alert alert = driver.switchTo().alert();
		String msg = alert.getText();
		System.out.println(msg);
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
	   // throw new PendingException();
	}

	@When("^user leaves last Name blank and clicks the button$")
	public void user_leaves_last_Name_blank_and_clicks_the_button() throws Throwable {
		driver.manage().window().maximize();
		objhbkg.setPfname("Rahul");Thread.sleep(3000);
		objhbkg.setPflname("");Thread.sleep(3000);
		objhbkg.setBtnPayment();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}

	@When("^user enters all data$")
	public void user_enters_all_data() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}

	@When("^user enters incorrect email format and clicks the button$")
	public void user_enters_incorrect_email_format_and_clicks_the_button() throws Throwable {
		driver.manage().window().maximize();
		objhbkg.setPfname("Rahul");Thread.sleep(3000);
		objhbkg.setPflname("capg1234");Thread.sleep(3000);
		objhbkg.setPfemail("");Thread.sleep(3000);
		objhbkg.setBtnPayment();
		
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}

	@When("^user leaves Mobileno balnk and clicks on button$")
	public void user_leaves_Mobileno_balnk_and_clicks_on_button() throws Throwable {
		driver.manage().window().maximize();
		objhbkg.setPfname("Rahul");Thread.sleep(3000);
		objhbkg.setPflname("capg1234");Thread.sleep(3000);
		objhbkg.setPfemail("rahul@capgemini.com");Thread.sleep(3000);
		objhbkg.setPfphoneno("");Thread.sleep(3000);
		objhbkg.setBtnPayment();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^user gives incorrect format$")
	public void user_gives_incorrect_format(DataTable arg1) throws Throwable {
		driver.manage().window().maximize();
		objhbkg.setPfname("Rahul");Thread.sleep(3000);
		objhbkg.setPflname("capg1234");Thread.sleep(3000);
		objhbkg.setPfemail("rahul@capgemini.com");Thread.sleep(3000);
		
		List<String> objList = arg1.asList(String.class);
		objhbkg.setBtnPayment();
		for(int i=0; i<objList.size(); i++) {
	if(Pattern.matches("^[7-9]{1}[0-9]{9}$", objList.get(i))) {
		System.out.println("***** Matched" + objList.get(i) + "*****");
	}
	else {
		System.out.println("***** NOT Matched" + objList.get(i) + "*****");
	}
		}
		
		
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    //throw new PendingException();
	}

	@Then("^display error msg$")
	public void display_error_msg() throws Throwable {
		Alert alert = driver.switchTo().alert();
		String msg = alert.getText();
		System.out.println(msg);
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	/*@When("^User leaves the address blank$")
	public void user_leaves_the_address_blank() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}*/

	@When("^user do not select any city$")
	public void user_do_not_select_any_city() throws Throwable {
		driver.manage().window().maximize();
		objhbkg.setPfname("Rahul");Thread.sleep(3000);
		objhbkg.setPflname("capg1234");Thread.sleep(3000);
		objhbkg.setPfemail("rahul@capgemini.com");Thread.sleep(3000);
		objhbkg.setPfphoneno("9090876543");Thread.sleep(3000);
		objhbkg.setPfcity("");
		objhbkg.setBtnPayment();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^user does not select any state$")
	public void user_does_not_select_any_state() throws Throwable {
		driver.manage().window().maximize();
		objhbkg.setPfname("Rahul");Thread.sleep(3000);
		objhbkg.setPflname("capg1234");Thread.sleep(3000);
		objhbkg.setPfemail("rahul@capgemini.com");Thread.sleep(3000);
		objhbkg.setPfphoneno("9090876543");Thread.sleep(3000);
		objhbkg.setPfcity("Pune");
		objhbkg.setPfstate("");
		objhbkg.setBtnPayment();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^User enters <numberofGueste>$")
	public void user_enters_numberofGueste() throws Throwable {
		driver.manage().window().maximize();
		objhbkg.setPfname("Rahul");Thread.sleep(3000);
		objhbkg.setPflname("capg1234");Thread.sleep(3000);
		objhbkg.setPfemail("rahul@capgemini.com");Thread.sleep(3000);
		objhbkg.setPfphoneno("9090876543");Thread.sleep(3000);
		objhbkg.setPfcity("Pune");Thread.sleep(3000);
		objhbkg.setPfstate("Maharashtra");Thread.sleep(3000);
		objhbkg.setPersons("");Thread.sleep(3000);
		objhbkg.setBtnPayment();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^allocate rooms such that (\\d+) room for minimum (\\d+) guests$")
	public void allocate_rooms_such_that_room_for_minimum_guests(int arg1, int arg2) throws Throwable {
		/*Alert alert = driver.switchTo().alert();
		String msg = alert.getText();
		System.out.println(msg);
		Thread.sleep(3000);
		driver.switchTo().alert().accept();*/
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	/*@Given("^user is on hotel booking page$")
	public void user_is_on_hotel_booking_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   //throw new PendingException();
	}*/

	@When("^user leaves CardHolderName blank and clicks the button$")
	public void user_leaves_CardHolderName_blank_and_clicks_the_button() throws Throwable {
		driver.manage().window().maximize();
		objhbkg.setPfname("Rahul");Thread.sleep(3000);
		objhbkg.setPflname("capg1234");Thread.sleep(3000);
		objhbkg.setPfemail("rahul@capgemini.com");Thread.sleep(3000);
		objhbkg.setPfphoneno("9090876543");Thread.sleep(3000);
		objhbkg.setPfcity("Pune");Thread.sleep(3000);
		objhbkg.setPfstate("Maharashtra");Thread.sleep(3000);
		objhbkg.setPersons("1");Thread.sleep(3000);
		objhbkg.setCardholderName("");Thread.sleep(3000);
		//objhbkg.setTxtDebit("9809765645326756");Thread.sleep(3000);
		//objhbkg.setTxtCvv("907");Thread.sleep(3000);
		//objhbkg.setMonth("09");Thread.sleep(3000);
		//objhbkg.setTxtYear("2020");
		//Thread.sleep(30000);
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		objhbkg.setBtnPayment();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^User enters card no$")
	public void user_enters_card_no() throws Throwable {
		driver.manage().window().maximize();
		objhbkg.setPfname("Rahul");Thread.sleep(3000);
		objhbkg.setPflname("capg1234");Thread.sleep(3000);
		objhbkg.setPfemail("rahul@capgemini.com");Thread.sleep(3000);
		objhbkg.setPfphoneno("9090876543");Thread.sleep(3000);
		objhbkg.setPfcity("Pune");Thread.sleep(3000);
		objhbkg.setPfstate("Maharashtra");Thread.sleep(3000);
		objhbkg.setPersons("1");Thread.sleep(3000);
		objhbkg.setCardholderName("Rahulv");Thread.sleep(3000);
		objhbkg.setTxtDebit("");Thread.sleep(3000);
		//objhbkg.setTxtCvv("907");Thread.sleep(3000);
		//objhbkg.setMonth("09");Thread.sleep(3000);
		//objhbkg.setTxtYear("2020");
		//Thread.sleep(30000);
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		objhbkg.setBtnPayment();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}

	/*@When("^no of digits is !=(\\d+)$")
	public void no_of_digits_is(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}*/

	@When("^User does not enetr any no$")
	public void user_does_not_enetr_any_no() throws Throwable {
		driver.manage().window().maximize();
		objhbkg.setPfname("Rahul");Thread.sleep(3000);
		objhbkg.setPflname("capg1234");Thread.sleep(3000);
		objhbkg.setPfemail("rahul@capgemini.com");Thread.sleep(3000);
		objhbkg.setPfphoneno("9090876543");Thread.sleep(3000);
		objhbkg.setPfcity("Pune");Thread.sleep(3000);
		objhbkg.setPfstate("Maharashtra");Thread.sleep(3000);
		objhbkg.setPersons("1");Thread.sleep(3000);
		objhbkg.setCardholderName("Rahulv");Thread.sleep(3000);
		objhbkg.setTxtDebit("9809765645326756");Thread.sleep(3000);
		objhbkg.setTxtCvv("");Thread.sleep(3000);
		//objhbkg.setMonth("09");Thread.sleep(3000);
		//objhbkg.setTxtYear("2020");
		//Thread.sleep(30000);
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		objhbkg.setBtnPayment();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^User do not enter any month$")
	public void user_do_not_enter_any_month() throws Throwable {
		driver.manage().window().maximize();
		objhbkg.setPfname("Rahul");Thread.sleep(3000);
		objhbkg.setPflname("capg1234");Thread.sleep(3000);
		objhbkg.setPfemail("rahul@capgemini.com");Thread.sleep(3000);
		objhbkg.setPfphoneno("9090876543");Thread.sleep(3000);
		objhbkg.setPfcity("Pune");Thread.sleep(3000);
		objhbkg.setPfstate("Maharashtra");Thread.sleep(3000);
		objhbkg.setPersons("1");Thread.sleep(3000);
		objhbkg.setCardholderName("Rahulv");Thread.sleep(3000);
		objhbkg.setTxtDebit("9809765645326756");Thread.sleep(3000);
		objhbkg.setTxtCvv("907");Thread.sleep(3000);
		objhbkg.setMonth("");Thread.sleep(3000);
		//objhbkg.setTxtYear("2020");
		//Thread.sleep(30000);
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		objhbkg.setBtnPayment();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}

	@Then("^displays eror msg$")
	public void displays_eror_msg() throws Throwable {
		Alert alert = driver.switchTo().alert();
		String msg = alert.getText();
		System.out.println(msg);
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^User does not enter any year$")
	public void user_does_not_enter_any_year() throws Throwable {
		driver.manage().window().maximize();
		objhbkg.setPfname("Rahul");Thread.sleep(3000);
		objhbkg.setPflname("capg1234");Thread.sleep(3000);
		objhbkg.setPfemail("rahul@capgemini.com");Thread.sleep(3000);
		objhbkg.setPfphoneno("9090876543");Thread.sleep(3000);
		objhbkg.setPfcity("Pune");Thread.sleep(3000);
		objhbkg.setPfstate("Maharashtra");Thread.sleep(3000);
		objhbkg.setPersons("1");Thread.sleep(3000);
		objhbkg.setCardholderName("Rahulv");Thread.sleep(3000);
		objhbkg.setTxtDebit("9809765645326756");Thread.sleep(3000);
		objhbkg.setTxtCvv("907");Thread.sleep(3000);
		objhbkg.setMonth("09");Thread.sleep(3000);
		objhbkg.setTxtYear("");
		//Thread.sleep(30000);
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		objhbkg.setBtnPayment();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}


	
}
