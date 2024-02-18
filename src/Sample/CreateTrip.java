package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CreateTrip {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver","C:\\chrome-win64\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa2.gim.com.bd/ejogajogAdmin/#/login");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abirarshad.gim@gmail.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("qwerty123");
        driver.findElement(By.id("action-login")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/app-root/app-layout/section/app-header/nav/button")).click();

        driver.findElement(By.xpath("/html/body/app-root/app-layout/section/app-sidebar/nav/ul/div/a[9]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[(text()='Create Trip')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("01812567321");
        driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg']")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("button[class='btn btn-outline-secondary calendar is-invalid']")).click();
        driver.findElement(By.xpath("/html/body/app-root/app-layout/section/app-service-operation-center/app-create-trip/div/div[2]/form/div/div[2]/div[1]/div[1]/div/div[2]/div/ngb-datepicker/div[2]/div/ngb-datepicker-month/div[6]/div[5]/div")).click();

        driver.findElement(By.xpath("//input[@placeholder='HH']")).sendKeys("11");
        driver.findElement(By.xpath("//input[@placeholder='MM']")).sendKeys("00");
        driver.findElement(By.xpath("//button[normalize-space()='AM']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@role='combobox']")).click();
        driver.findElement(By.xpath("//span[normalize-space()='Abrasive Powder']")).click();


        String OptionToSelect = "BRAC University, Dhaka";
        driver.findElement(By.xpath("//input[@id='createPickUpCtrl']")).sendKeys("BRAC University, Dhaka");
        Thread.sleep(3000);
        List<WebElement> optionList = driver.findElements(By.xpath("//ul[@class='dropdown-menu show']//li"));
        for (WebElement ele : optionList) {
            String currentOption = ele.getText();

            if (currentOption.contains(OptionToSelect)) {
                ele.click();
                break;
            }
        }
        Thread.sleep(3000);

        String OptionToSelect2 = "Sathmatha, Bogura";
        driver.findElement(By.xpath("//input[@id='createDropOffCtrl']")).sendKeys("Sathmatha, Bogura");
        Thread.sleep(3000);
        List<WebElement> optionList2 = driver.findElements(By.xpath("//ul[@class='dropdown-menu show']//li"));
        for (WebElement ele : optionList2) {
            String currentOption2 = ele.getText();

            if (currentOption2.contains(OptionToSelect2)) {
                ele.click();
                break;
            }
        }

        Thread.sleep(3000);

        WebElement w = driver.findElement(By.xpath("/html/body/app-root/app-layout/section/app-service-operation-center/app-create-trip/div/div[2]/form/div/div[2]/div[1]/div[2]/div/div[7]/div[5]/ng-select/div/div/div[2]/input"));
        w.sendKeys("m");
        w.sendKeys(Keys.ARROW_DOWN);
        w.sendKeys(Keys.ENTER);


        driver.findElement(By.xpath("//button[@type='submit']")).submit();

        Thread.sleep(3000);

        driver.findElement(By.cssSelector(".form-control.ng-untouched.ng-pristine.ng-invalid")).sendKeys("Hi");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
        Thread.sleep(3000);
        System.out.println("Trip created Successfully");


    }
}
