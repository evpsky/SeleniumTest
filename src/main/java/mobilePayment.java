import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class mobilePayment {
    // Определение UI элементов на странице

    By phoneNumber = By.xpath("//input[@data-qa-node=\"phone-number\"]");
    By amount = By.xpath("//input[@data-qa-node=\"amount\"]");
    By cardNumber = By.xpath("//input[@data-qa-node=\"numberdebitSource\"]");
    By validDate = By.xpath("data-qa-node=\"expiredebitSource\"");
    By cvv = By.xpath("//input[@data-qa-node=\"cvvdebitSource\"]");
    By buttonInput = By.xpath("//button[@data-qa-node=\"submit\"]");

    // Описание вспомогательных методов
    //Test string

    // Написание тестов

    @Test
    public void checkMinPaymentSum(){


        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.get("https://next.privat24.ua/mobile");
        driver.findElement(phoneNumber).sendKeys("959512344532");
        driver.quit();


    }



}