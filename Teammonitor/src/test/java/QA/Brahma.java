package QA;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;
public class Brahma {
   // public static void main(String[] args) {
	
    	@Test
		public static void Brahma() throws InterruptedException {
			ChromeDriver driver = new ChromeDriver();
			 
			driver.manage().window().maximize();

			 driver.get("https://automation-privacy-rotary-multiple.trycloudflare.com/LoginPage");
			 
			 
			Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div/input")).sendKeys("teamheadhemlata@gmail.com");
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div/div/input")).sendKeys("Hem@12345");
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div/div/div[2]/form/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div/div/div/div[2]/ul/li[2]/a")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div/div/div/div[2]/ul/li[3]/a/div/div")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div/div/div/div[2]/ul/li[4]/a/div/div[1]")).click();
			
			
	
			
			
			
			}
    }


