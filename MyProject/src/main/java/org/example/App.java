package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import java.util.concurrent.TimeUnit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        testForBuyDress();
//        testChangePasword();
    }

    public static void testForBuyDress() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

//        Actions action = new Actions(driver);

        driver.get("http://automationpractice.com");

        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("maxmaximys@mail.ru");
        driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("qaswedfr");
        driver.findElement(By.xpath("//button[@id='SubmitLogin']/span")).click();

        WebElement dressButton = driver.findElement(By.xpath("(//a[contains(text(),'Dresses')])[5]"));
        dressButton.click();
        WebElement eveningDressButton = driver.findElement(By.xpath("//*[@id=\"categories_block_left\"]/div/ul/li[2]/a"));
        eveningDressButton.click();
//        action.moveToElement(dressButton).moveToElement(eveningDressButton).click();

        WebElement printDressButton = driver.findElement(By.xpath("//img[@alt='Printed Dress']"));
        printDressButton.click();
        WebElement addToCart = driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span"));
        addToCart.click();
//        action.moveToElement(printDressButton).moveToElement(addToCart).click();

        driver.findElement(By.cssSelector(".continue > span")).click();
        driver.findElement(By.linkText("Sign out")).click();
        driver.quit();

    }

    public static void testChangePasword() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

//        Actions action = new Actions(driver);

        driver.get("http://automationpractice.com");

        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("maxmaximys@mail.ru");
        driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("qaswedfr");
        driver.findElement(By.xpath("//button[@id='SubmitLogin']/span")).click();

        driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[4]/a/span")).click();

        driver.findElement(By.xpath("//select[@id='days']")).click();
        driver.findElement(By.xpath("//select[@id='days']/option[5]")).click();

        driver.findElement(By.xpath("//input[@id='old_passwd']")).sendKeys("qaswedfr");
        driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("qaswedfr");
        driver.findElement(By.xpath("//input[@id='confirmation']")).sendKeys("qaswedfr");


        driver.findElement(By.xpath("//input[@id='newsletter']")).click();

        driver.findElement(By.xpath("//span[contains(.,'Save')]")).click();

        driver.findElement(By.linkText("Sign out")).click();
        driver.quit();

    }
}
