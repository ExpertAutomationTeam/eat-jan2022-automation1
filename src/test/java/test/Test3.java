package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Test3 {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "/Users/nacer-zimu/IdeaProjects/eatjan172022automation1/src/driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
    }

    @Test
    public void test1(){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("computer");
        driver.findElement(By.id("nav-search-submit-button")).click();
    }

    @Test
    public void test2(){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("ps5");
        driver.findElement(By.id("nav-search-submit-button")).click();
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
