package masaiSchool;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class allMasai {
	WebDriver driver;

	@BeforeClass
	public void Url() {
		driver =new ChromeDriver();
	driver.get("https://www.masaischool.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(priority=1)
	public void homepage() {
		
		 WebElement logo = driver.findElement(By.cssSelector("[alt=\"masai Logo\"]"));
	        assert logo.isDisplayed();
		
	}
	
	@Test (priority=2)
	public void Regiser() {
		
		driver.findElement(By.xpath("//button[@id='nav_login']")).click();
		driver.findElement(By.cssSelector("[placeholder=\"Enter full name\"]")).sendKeys("Anil Rajak");
		driver.findElement(By.id("email")).sendKeys("mrrajak1296@gmail.com");
		driver.findElement(By.id("phone_number")).sendKeys("9876543210");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		
	}
	
	@Test(priority=3)
	public void Login() {
		driver.findElement(By.xpath("//button[@id='nav_login']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
		driver.findElement(By.id("emailOrPhone")).sendKeys("9876543210");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Test(priority=4)
	public void Hirefromus() throws InterruptedException {
		
		driver.findElement(By.cssSelector("li:nth-child(3) a:nth-child(1)")).click();
		driver.findElement(By.cssSelector("[placeholder=\"Enter your name\"]")).sendKeys("Anil");
		driver.findElement(By.id("company")).sendKeys("Masai");
		driver.findElement(By.id("email")).sendKeys("mrrajak1296@gmail.com");
		driver.findElement(By.id("phone_number")).sendKeys("9876543210");
		driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
		
		

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement sdte = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body//svelte//select[1]")));
        sdte.click();
        Select drop = new Select(sdte);
        drop.selectByVisibleText("SDET");
		
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement Experience = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//body//svelte//select[2]")));
        Experience.click();
        Select drop1 = new Select(Experience);
        drop1.selectByValue("Entry Level (0-2 years)");
		
        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement Hiring = wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//body//svelte//select[3]")));
        Hiring.click();
        Select drop2 = new Select(Hiring);
        drop2.selectByValue("1 month"); 

        WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement Location = wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//body//svelte//select[4]")));
        Location.click();
        Select drop3 = new Select(Location);
        drop3.selectByValue("Delhi NCR");
		
	}
	@AfterClass
	public void teardown() {
		driver.quit();
	}
	

}
