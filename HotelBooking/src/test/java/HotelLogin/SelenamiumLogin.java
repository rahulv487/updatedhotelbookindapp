package HotelLogin;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelenamiumLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new FirefoxDriver();
driver.get("file:///D:/hotel%20booking/hotelBooking/login.html/");
//String strheading = driver.findElement(By.xpath("//*[@id='mainCnt']/div/div[1]/h1")).getText();
//if(strheading.contentEquals("Hotel Booking Application"))
//{
	//System.out.println("Heading Matched");

//driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
Thread.sleep(3000);
driver.findElement(By.name("userName")).sendKeys("capgemini");
//driver.findElement(By.name("userPwd")).sendKeys("capg1234");
driver.findElement(By.name("userPwd")).sendKeys("capg1");
Thread.sleep(3000);
driver.findElement(By.className("btn")).click();
driver.switchTo().alert();
Thread.sleep(3000);
System.out.println("Password entered is incorrect");
driver.switchTo().alert().accept();
//Thread.sleep(30000);
//driver.navigate().to("file:///D:/hotel%20booking/hotelBooking/hotelbooking.html/");
//Thread.sleep(3000);
	//}
	//else
	//{
		System.out.println("Heading Not Matched");
	//}
//driver.close();
//driver.quit();
}

}
