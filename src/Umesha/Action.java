package Umesha;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Action {
public static void main(String[] args) throws InterruptedException {
	
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\91880\\OneDrive\\Documents\\Automation\\Selenium\\chromedriver_win32 (3)\\chromedriver.exe");
    
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.com");
	//Thread.sleep(3000);
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	//or
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
   // WebElement trydifferentimage = driver.findElement(By.xpath("//a[@onclick='window.location.reload()']"));
   //  trydifferentimage.click();
	//driver.manage().window().maximize();
	String url = driver.getCurrentUrl();
	System.out.println(url);
	
    WebElement amazonlogo = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
	boolean result = amazonlogo.isDisplayed();
	System.out.println(result);
	if(result==true) {
		System.out.println("Pass");
	}
	else {
		System.out.println("Fail");
	}
	
	//Thread.sleep(1000);
	WebElement accAndList = driver.findElement(By.xpath("//span[text()='Account & Lists']"));

	WebElement order = driver.findElement(By.xpath("//span[text()='Orders']"));
	
	Actions act = new Actions(driver);
	//act.moveToElement(accAndList).moveToElement(order).click().build().perform();  //like method chaining
	//or
	act.moveToElement(accAndList).perform();
	act.moveToElement(order).perform();	
	act.click().perform();
	
	driver.navigate().back();
	
	
	WebElement serchbar = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	//Thread.sleep(1000);
	serchbar.sendKeys("skullcandy earphone");
	
	WebElement serchbutton = driver.findElement(By.xpath("//input[@type='submit'] "));
	serchbutton.click();
	//Thread.sleep(3000);
	
	WebElement blueEarphone = driver.findElement(By.xpath("(//img[@class='s-image'])[4]"));
	blueEarphone.click();
//	Thread.sleep(1000);

	WebElement blackEarphone = driver.findElement(By.xpath("(//img[@class='imgSwatch'])[1]"));
	Actions act1 = new Actions(driver);
	act1.moveToElement(blackEarphone).perform();
//	Thread.sleep(1000);

	WebElement redEarphone = driver.findElement(By.xpath("(//img[@class='imgSwatch'])[3]"));
	Actions act2 = new Actions(driver);
	act2.moveToElement(redEarphone).perform();
//	Thread.sleep(1000);

	WebElement whiteEarphone = driver.findElement(By.xpath("(//img[@class='imgSwatch'])[4]"));
	Actions act3 = new Actions(driver);
	act3.moveToElement(whiteEarphone).perform();
//	Thread.sleep(1000);

	WebElement cobaltBlueEarphone = driver.findElement(By.xpath("(//img[@class='imgSwatch'])[5]"));
	Actions act4 = new Actions(driver);
	act4.moveToElement(cobaltBlueEarphone).perform();
//	Thread.sleep(1000);

	WebElement miamiEarphone = driver.findElement(By.xpath("(//img[@class='imgSwatch'])[6]"));
	Actions act5 = new Actions(driver);
	act5.moveToElement(miamiEarphone).perform();
//	Thread.sleep(1000);

	WebElement sunsetEarphone = driver.findElement(By.xpath("(//img[@class='imgSwatch'])[7]"));
	Actions act6 = new Actions(driver);
	act6.moveToElement(sunsetEarphone).perform();
//	Thread.sleep(1000);

	WebElement pinkEarphone = driver.findElement(By.xpath("(//img[@class='imgSwatch'])[8]"));
	Actions act7 = new Actions(driver);
	act7.moveToElement(pinkEarphone).perform();
//	Thread.sleep(1000);

	WebElement purpleEarphone = driver.findElement(By.xpath("(//img[@class='imgSwatch'])[9]"));
	Actions act8 = new Actions(driver);
	act8.moveToElement(purpleEarphone).perform();
//	Thread.sleep(1000);

	WebElement gryEarphone = driver.findElement(By.xpath("(//img[@class='imgSwatch'])[10]"));
	Actions act9 = new Actions(driver);
	act9.moveToElement(gryEarphone).perform();
	
//	Thread.sleep(3000);
	// WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
	//WebElement addToCart1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Add to Cart']")));
	
	WebElement addToCart = driver.findElement(By.xpath("//input[@value='Add to Cart']"));
	addToCart.click();
	//Thread.sleep(8000);
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	WebElement cart1= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='attach-sidesheet-view-cart-button']")));
	
	WebElement cart = driver.findElement(By.xpath("//span[@id='attach-sidesheet-view-cart-button']"));
	cart.click();
	Thread.sleep(5000);
	
	WebElement blueEarphone1 = driver.findElement(By.xpath("//img[@alt='Skullcandy Jib In-Ear Earbuds - Blue, Opens in a new tab']"));
    System.out.println("Produt Add To Cart");
	boolean result4 =blueEarphone1.isDisplayed();
    System.out.println(result4);
    if(result4==true) {
    	System.out.println("Pass");
    }
	else
	{
		System.out.println("Fail");
	}
//    WebDriverWait wait1= new WebDriverWait(driver,Duration.ofSeconds(3));
    // WebElement addToCart2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='submit'])[32]")));
    
	// WebDriverWait wait1= new WebDriverWait(driver,Duration.ofSeconds(7));
    // WebElement cart = driver.findElement(By.xpath("(//input[@type='submit'])[32]"));

	   // WebElement cart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='submit'])[32]")));
        // cart.click();
	
	//driver.navigate().back();
//	Thread.sleep(2000);
	
	//WebElement cart = driver.findElement(By.xpath("//span[@class='nav-cart-icon nav-sprite']"));
    //cart.click();
	
	
	
	
	
	
}
}
