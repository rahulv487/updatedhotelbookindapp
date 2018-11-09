package pageBean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelBookingPageFactory {

	WebDriver driver;
	
	@FindBy(id="txtFirstName") 
	//@CacheLookup
	WebElement pfname;
	
	@FindBy(id="txtLastName") 
	//@CacheLookup
	WebElement pflname;
	
	@FindBy(id="txtEmail") 
	//@CacheLookup
	WebElement pfemail;
	
	@FindBy(id="txtPhone") 
	//@CacheLookup
	WebElement pfphoneno;
	
	@FindBy(name="city") 
	//@CacheLookup
	WebElement pfcity;
	
	@FindBy(name="state") 
	//@CacheLookup
	WebElement pfstate;
	
	@FindBy(name="persons") 
	//@CacheLookup
	WebElement persons;
	
	@FindBy(id="txtCardholderName") 
	//@CacheLookup
	WebElement CardholderName;
	
	@FindBy(id="txtDebit") 
	//@CacheLookup
	WebElement txtDebit;
	
	@FindBy(id="txtCvv") 
	//@CacheLookup
	WebElement txtCvv;
	
	@FindBy(id="txtMonth") 
	//@CacheLookup
	WebElement Month;
	
	@FindBy(id="txtYear") 
	//@CacheLookup
	WebElement txtYear;
	
	@FindBy(id="btnPayment") 
	//@CacheLookup
	WebElement btnPayment;
	
	public HotelBookingPageFactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	/*public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		pfname.sendKeys(driver);
	}*/

	public WebElement getPfname() {
		return pfname;
	}

	public void setPfname(String fname) {
		pfname.sendKeys(fname);
	}

	public WebElement getPflname() {
		return pflname;
	}

	public void setPflname(String lname) {
		pflname.sendKeys(lname);
	}

	public WebElement getPfemail() {
		return pfemail;
	}

	public void setPfemail(String email) {
		pfemail.sendKeys(email);
	}

	public WebElement getPfphoneno() {
		return pfphoneno;
	}

	public void setPfphoneno(String phoneno) {
		pfphoneno.sendKeys(phoneno);
	}

	public WebElement getPfcity() {
		return pfcity;
	}

	public void setPfcity(String city) {
		pfcity.sendKeys(city);
	}

	public WebElement getPfstate() {
		return pfstate;
	}

	public void setPfstate(String state) {
		pfstate.sendKeys(state);
	}

	public WebElement getPersons() {
		return persons;
	}

	public void setPersons(String person) {
		persons.sendKeys(person);
	}

	public WebElement getCardholderName() {
		return CardholderName;
	}

	public void setCardholderName(String cardholder) {
		CardholderName.sendKeys(cardholder);
	}

	public WebElement getTxtDebit() {
		return txtDebit;
	}

	public void setTxtDebit(String Debit) {
		txtDebit.sendKeys(Debit);
	}

	public WebElement getTxtCvv() {
		return txtCvv;
	}

	public void setTxtCvv(String Cvv) {
		txtCvv.sendKeys(Cvv);
	}
	

	public WebElement getMonth() {
		return Month;
	}

	public void setMonth(String months) {
		Month.sendKeys(months);
	}

	public WebElement getTxtYear() {
		return txtYear;
	}

	public void setTxtYear(String Year) {
		txtYear.sendKeys(Year);
	}

	public WebElement getBtnPayment() {
		return btnPayment;
	}

	public void setBtnPayment() {
		btnPayment.click();
	}
	
	
	
}
