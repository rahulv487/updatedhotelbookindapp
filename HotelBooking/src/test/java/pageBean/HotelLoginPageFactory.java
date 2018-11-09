package pageBean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HotelLoginPageFactory {

WebDriver driver;

@FindBy(name="userName")
@CacheLookup
WebElement pfuname;

@FindBy(how=How.NAME, using="userPwd")
@CacheLookup
WebElement pfpwd;

@FindBy(className="btn")
@CacheLookup
WebElement pflogin;


public HotelLoginPageFactory(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}


/*public WebDriver getDriver() {
	return driver;
}


public void setDriver(WebDriver driver) {
	this.driver = driver;
}*/


public WebElement getPfuname() {
	return pfuname;
}


public void setPfuname(String suname) {
	pfuname.sendKeys(suname);
}


public WebElement getPfpwd() {
	return pfpwd;
}


public void setPfpwd(String pwd) {
	pfpwd.sendKeys(pwd);;
}


public WebElement getPflogin() {
	return pflogin;
}


public void setPflogin() {
	pflogin.click();
}


	
}
