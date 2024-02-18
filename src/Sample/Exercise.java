package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Exercise {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver","C:\\chrome-win64\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("abirarshad0@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("12345");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
    }}