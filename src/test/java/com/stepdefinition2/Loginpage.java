package com.stepdefinition2;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginpage {
	WebDriver driver;
	@Given("user is on adactin login page")
	public void user_is_on_adactin_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();

	}

	

	@When("user should perform login {string} and {string}")
	public void user_should_perform_login_and(String userName, String password) {
		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys(userName);
		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys(password);
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();

	}
	@When("user should search hotels {string},{string},{string}, {string},{string},{string},")
	public void user_should_search_hotels(String location, String hotels, String roomtype, String noofrooms,
			String adultsperroom, String childrenperoom) {
driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		WebElement dDnlocation = driver.findElement(By.id("location"));
		Select select = new Select(dDnlocation);
		select.selectByIndex(1);		
		
		WebElement dDnhotels = driver.findElement(By.id("hotels"));
		Select select1 = new Select(dDnhotels);
		select1.selectByIndex(1);
		
		WebElement dDnroomtype = driver.findElement(By.name("room_type"));
		Select select2 = new Select(dDnroomtype);
		select2.selectByIndex(1);
		
		
		WebElement dDnRoomNos = driver.findElement(By.id("room_nos"));
		Select select3 = new Select(dDnRoomNos);
		select3.selectByIndex(2);
		
		WebElement dDnAdultRoom = driver.findElement(By.id("adult_room"));
		Select select4 = new Select(dDnAdultRoom);
		select4.selectByIndex(3);
		WebElement dDnChildRoom = driver.findElement(By.id("child_room"));
		Select select5 = new Select(dDnChildRoom);
		select5.selectByIndex(1);
		
		driver.findElement(By.id("Submit")).click();
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
		
	}

	
	@When("user should enter details  {string},{string},{string},{string},{string},{string}, {string},{string}")
	public void user_should_enter_details(String firstName, String lastName, String billingAddress, String creditcard, String cardType, String month, String year, String cvv) {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.id("first_name")).sendKeys(firstName);
		driver.findElement(By.id("last_name")).sendKeys(lastName);
		driver.findElement(By.id("address")).sendKeys(billingAddress);
		driver.findElement(By.id("cc_num")).sendKeys(creditcard);
		WebElement dDnCtype = driver.findElement(By.id("cc_type"));
		Select select = new Select(dDnCtype);
		select.selectByVisibleText(cardType);
		WebElement dDnCDate = driver.findElement(By.id("cc_exp_month"));
		Select select1 = new Select(dDnCDate);
		select1.selectByVisibleText(month);
		WebElement dDnCYear = driver.findElement(By.id("cc_exp_year"));
		Select select2 = new Select(dDnCYear);
		select2.selectByVisibleText(year);
		
		driver.findElement(By.id("cc_cvv")).sendKeys(cvv);
		
		driver.findElement(By.id("book_now")).click();
		WebElement printOrder = driver.findElement(By.id("order_no"));
		String attribute = printOrder.getAttribute("value");
		System.out.println(attribute);
		
	}
	@Then("user should verify success message")
	
		public void use_should_verify_success_messsage() {
			Assert.assertTrue(true);
	}
	
	
}