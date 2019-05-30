package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTests {

    private WebDriver driver = null;
    private ChromeOptions chromeOptions = null;

    @FindBy(xpath ="//*[@id=\"email\"]")
    public WebElement inputEmail;

    @FindBy(xpath ="//*[@id=\"pass\"]")
    public WebElement inputPassword;

    @FindBy(xpath ="//input[@value='Iniciar sesión']")
    public WebElement ButtonLogin;

    @Test
    public void firstExampleTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ametidji\\repos\\parkingcalculator\\src\\resources\\chromedriver.exe");
        chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");

        driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("http://www.facebook.com");

        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("amine.metidji@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"pass\"]")) .sendKeys("fafafa");
        driver.findElement(By.xpath("//input[@value='Log In']")).click();

        Thread.sleep(3000);

        driver.quit();
    }




}
