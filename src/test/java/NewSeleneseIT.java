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
public class NewSeleneseIT {
    
    @Test
    public void testSimple() throws Exception {
        // Create a new instance of the Firefox driver
        // Notice that the remainder of the code relies on the interface, 
        // not the implementation.
        
        System.setProperty("webdriver.chrome.driver", "/Users/acnapich/Desktop/SeleniumDrivers/chromedriver");
        
        WebDriver driver = new ChromeDriver();

        // And now use this to visit NetBeans
        //driver.get("http://www.netbeans.org");
        driver.get("http://localhost:8282/MavenMyBycicleRides/faces/index.xhtml");
        //driver.get("http://localhost:8282/MavenMyBycicleRides/faces/index.xhtml");
        // Alternatively the same thing can be done like this
        // driver.navigate().to("http://www.netbeans.org");

        //Thread.sleep(4000);
        //driver.findElement(By.id("details-button")).click();
        //Thread.sleep(4000);
        
        //driver.findElement(By.id("proceed-link")).click();
        //Thread.sleep(4000);
        // Check the title of the page
        // Wait for the page to load, timeout after 10 seconds
        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver d) {
                return d.getTitle().contains("Bicycle");
            }
        });

        //Close the browser
        driver.quit();
    }
    
}
