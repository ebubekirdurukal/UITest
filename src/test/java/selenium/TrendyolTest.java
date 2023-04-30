package selenium;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrendyolTest {

    WebDriver driver;


    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ebube\\projects\\education\\Selenium\\src\\test\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
    }


    @After
    public void tearDown(){
        driver.close();
        driver.quit();
    }


    //UI test senaryosu
    @Test
    public void girisYapButonuTest() throws InterruptedException {
        Thread.sleep(3000);
        driver.get("https://www.trendyol.com/"); // bir url'e ulaşmak için kullanılır.
        Thread.sleep(2000);
        WebElement kapatButonu = driver.findElement(By.xpath("//*[@id=\"gender-popup-modal\"]/div/div/div[1]")); // element bulmak için kullanılır
        kapatButonu.click();
        Thread.sleep(2000);
        WebElement girisYapButonu = driver.findElement(By.xpath("//*[@id=\"account-navigation-container\"]/div/div[1]/div[1]/p"));
        girisYapButonu.click();
        Thread.sleep(2000);
        WebElement emailAlani = driver.findElement(By.id("login-email"));
        Assert.assertTrue(emailAlani.isDisplayed());
        Thread.sleep(2000);
        emailAlani.sendKeys("ebubekir.durukal@gmail.com");
        Thread.sleep(2000);
    }





}

