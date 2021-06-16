package deneme.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.*;

public class Ecommers {
        WebDriver driver;


        //BeforeClass Olusturma

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
    }
      @BeforeMethod
    public void test2(){
        driver.get("http://automationpractice.com/index.php");

      }




}
