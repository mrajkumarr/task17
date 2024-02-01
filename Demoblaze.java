package Task17;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demoblaze {

			public static void main(String[] args) throws InterruptedException {
			
				//Using Edge Browser Instead of Chrome 
				WebDriver driver = new EdgeDriver();
				
				//Maximizing the window 
				driver.manage().window().maximize(); 
				
				//Navigating the URL
				driver.navigate().to("https://www.demoblaze.com/"); 

				//Using ImplicitlyWait for page to wait for click
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));				

				//Using linkText for clicking the element Laptop
				driver.findElement(By.linkText("Laptops")).click();
				
				//Using Thread sleep for wait to load
				Thread.sleep(2000);
				
				//Using linkText for clicking the element MacBook air
				driver.findElement(By.linkText("MacBook air")).click();

				//Using linkText for clicking the Add to cart
				driver.findElement(By.linkText("Add to cart")).click();
				Thread.sleep(2000);

				//Switch to alert box
				Alert alert = driver.switchTo().alert();

				//Displaying the alert
				String info = alert.getText();
				System.out.print("DemoBlaze Alert Information - " +info);
				System.out.print("\n");
				System.out.print("\n");
				
				//Clicking ok button
				alert.accept();
			
				//Closing the driver
				driver.close(); 
				
			}
}
