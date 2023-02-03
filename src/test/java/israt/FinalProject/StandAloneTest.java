package israt.FinalProject;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StandAloneTest {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/client/");
		
//		driver.findElement(By.cssSelector("p.login-wrapper-footer-text")).click();
//		
//		driver.findElement(By.id("firstName")).sendKeys("Israt");
//		driver.findElement(By.id("lastName")).sendKeys("Jahan");
//		driver.findElement(By.id("userEmail")).sendKeys("toha992@gmail.com");
//		driver.findElement(By.id("userMobile")).sendKeys("1971298080");
//	    WebElement dropDown =	driver.findElement(By.className("custom-select"));
//		Select selObj = new Select(dropDown);
//		selObj.selectByValue("2: Student");
//		driver.findElement(By.cssSelector("input[value='Female']")).click();
//		driver.findElement(By.id("userPassword")).sendKeys("Konka84I");
//		driver.findElement(By.id("confirmPassword")).sendKeys("Konka84I");
//		driver.findElement(By.cssSelector("div.col-md-1")).click();
//		driver.findElement(By.id("login")).click();
//		
//		driver.findElement(By.cssSelector(".btn.btn-primary")).click();
		
		driver.findElement(By.id("userEmail")).sendKeys("toha993@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Konka84I");
		driver.findElement(By.id("login")).click();
		
		List<WebElement> body = driver.findElements(By.className("card-body"));
		WebElement product = body.stream().filter(i ->i.findElement(By.tagName("h5")).getText().
				equals("ADIDAS ORIGINAL")).findFirst().orElse(null);
		product.findElement(By.cssSelector("button.btn.w-10.rounded")).click();
		
		
		
//		int i;
//		for(i=0;i<body.size();i++) {
//			String prodName = body.get(i).findElement(By.tagName("h5")).getText();
//			System.out.println(prodName);
//			if(prodName.equalsIgnoreCase("Adidas original")) {
//				body.get(i).findElement(By.cssSelector("button.btn.w-10.rounded")).click();
//				Thread.sleep(5000);
//			}	
//		}
	
	}

}
