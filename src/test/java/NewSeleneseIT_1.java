/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author acnapich
 */
public class NewSeleneseIT_1 {
    
    @Test
    public void testSimple() throws Exception {
        // Create a new instance of the Firefox driver
        // Notice that the remainder of the code relies on the interface, 
        // not the implementation.
        
        System.setProperty("webdriver.chrome.driver", "/Users/acnapich/Desktop/SeleniumDrivers/chromedriver");
        
        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost:8282/MavenMyBycicleRides/faces/index.xhtml");
        
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/a")).click();
        Thread.sleep(4000);
        
        driver.findElement(By.xpath("//*[@id=\"j_idt11\"]/a[1]")).click();
        Thread.sleep(4000);
        
        driver.findElement(By.xpath("//*[@id=\"j_idt12:id\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"j_idt12:id\"]")).sendKeys("3");
        Thread.sleep(4000);
        
        driver.findElement(By.xpath("//*[@id=\"j_idt12:km\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"j_idt12:km\"]")).sendKeys("10.0");
        Thread.sleep(4000);
        
        //Close the browser
        driver.quit();
    }
    
}
