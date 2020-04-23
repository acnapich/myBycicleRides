/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Assert;
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
        
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/a")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//*[@id=\"j_idt11\"]/a[1]")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//*[@id=\"j_idt12:id\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"j_idt12:id\"]")).sendKeys("3");
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//*[@id=\"j_idt12:km\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"j_idt12:km\"]")).sendKeys("15.61");
        Thread.sleep(1000);
     
        driver.findElement(By.xpath("//*[@id=\"j_idt12:time\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"j_idt12:time\"]")).sendKeys("50.00");
        Thread.sleep(1000);
    
        driver.findElement(By.xpath("//*[@id=\"j_idt12:link\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"j_idt12:link\"]")).sendKeys("https://www.strava.com/activities/3221023288");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"j_idt12:data\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"j_idt12:data\"]")).sendKeys("26/03/2020");
        Thread.sleep(1000);        

        driver.findElement(By.xpath("//*[@id=\"j_idt12\"]/a[1]")).click();
        Thread.sleep(1000);        
 
        driver.findElement(By.xpath("//*[@id=\"j_idt12\"]/a[2]")).click();
        Thread.sleep(1000);        
 
        driver.findElement(By.xpath("//*[@id=\"j_idt11\"]/table/tbody/tr[3]/td[6]/a[3]")).click();
        Thread.sleep(1000);        

        
        boolean cancellato = false;
        
        String valore = driver.findElement(By.xpath("//*[@id=\"j_idt11:messagePanel\"]/table/tbody/tr/td")).getText();
        System.out.println(valore);
        if (valore.equals("Rides was successfully deleted.")) {
            cancellato = true;
        }
        Assert.assertEquals(true, cancellato);
        
        driver.quit();
    }
    
}
