package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.manage().window().maximize();

//        testForCreateCRMProject();
        testForCreateContactPerson();



    }
    public static void testForCreateCRMProject() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://crm.geekbrains.space/user/login");
        driver.findElement(By.id("prependedInput")).sendKeys("Applanatest1");
        driver.findElement(By.id("prependedInput2")).sendKeys("Student2020!");
        driver.findElement(By.id("_submit")).click();

        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[3]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[3]/ul/li[4]/a/span")).click();
        driver.findElement(By.linkText("Создать проект")).click();

        driver.findElement(By.name("crm_project[name]")).sendKeys("ProjectForAlex");

        driver.findElement(By.xpath("//span[contains(.,'Укажите организацию')]")).click();
        driver.findElement(By.xpath("/html/body/div[6]/ul[2]/li[1]/div")).click();

        driver.findElement(By.name("crm_project[businessUnit]")).click();
        driver.findElement(By.xpath("//*[@name=\"crm_project[businessUnit]\"]/option[2]")).click();

        driver.findElement(By.name("crm_project[curator]")).click();
        driver.findElement(By.xpath("//*[@name=\"crm_project[curator]\"]/option[3]")).click();

        driver.findElement(By.name("crm_project[rp]")).click();
        driver.findElement(By.xpath("//*[@name=\"crm_project[rp]\"]/option[3]")).click();

        driver.findElement(By.name("crm_project[administrator]")).click();
        driver.findElement(By.xpath("//*[@name=\"crm_project[administrator]\"]/option[3]")).click();

        driver.findElement(By.name("crm_project[manager]")).click();
        driver.findElement(By.xpath("//*[@name=\"crm_project[manager]\"]/option[3]")).click();

//        Не выбирается поле даже по предложенному вами локатору
        driver.findElement(By.xpath(".//label[text()='Основное контактное лицо']/../../div[@class=\"controls\"]/div")).click();
        driver.findElement(By.xpath("/html/body/div[7]/div/input")).sendKeys("Depp Johnny");
        driver.findElement(By.xpath("/html/body/div[7]/ul[2]/li[107]/div")).click();

        driver.findElement(By.linkText("Сохранить и закрыть")).click();

        Thread.sleep(10000l);
        WebElement webElement = driver.findElement(By.cssSelector("li#user-menu>a"));
        webElement.click();
        driver.findElement(By.xpath("//a[text()='Выйти']")).click();


        driver.quit();
    }

    public static void testForCreateContactPerson() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://crm.geekbrains.space/user/login");
        driver.findElement(By.id("prependedInput")).sendKeys("Applanatest1");
        driver.findElement(By.id("prependedInput2")).sendKeys("Student2020!");
        driver.findElement(By.id("_submit")).click();

//        Переход на вкладку контактные лица и создание контактного лица
        driver.findElement(By.cssSelector("#main-menu > ul > li.dropdown.first > a")).click();
        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/ul/li[4]/a/span")).click();
        driver.findElement(By.linkText("Создать контактное лицо")).click();

//        Заполняем поле фамилия
        driver.findElement(By.name("crm_contact[lastName]")).sendKeys("ARTY12");

//        Заполняем поле Имя
        driver.findElement(By.name("crm_contact[firstName]")).sendKeys("MADY12");

//        Указываем организацию
        driver.findElement(By.xpath("//span[contains(.,'Укажите организацию')]")).click();
        driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/div/input")).sendKeys("«Все организации»");
        driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul[2]/li/div")).click();

//        Указываем должность
        driver.findElement(By.name("crm_contact[jobTitle]")).sendKeys("Ktoto11");

//        Сохраняем и закрываем
        driver.findElement(By.xpath("//button[contains(.,'Сохранить и закрыть')]")).click();

        Thread.sleep(10000l);
        WebElement webElement = driver.findElement(By.cssSelector("li#user-menu>a"));
        webElement.click();
        driver.findElement(By.xpath("//a[text()='Выйти']")).click();
//        driver.findElement(By.xpath("/html/body/div[2]/div/header/div[1]/div/ul/li[1]/a")).click();
//        driver.findElement(By.xpath("//a[text()='Выйти'")).click();


        driver.quit();
    }
}
