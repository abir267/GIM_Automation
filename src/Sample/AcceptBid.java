package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AcceptBid {
    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa2.gim.com.bd/ejogajogAdmin/#/login");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abirarshad.gim@gmail.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("qwerty123");
        driver.findElement(By.id("action-login")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[@class='navbar-toggler-icon']")).click();
        Thread.sleep(3000);
        //driver.findElement(By.xpath("//*[(text()='SOC')]")).click();
        //Thread.sleep(3000);
        //driver.findElement(By.xpath("//span[normalize-space()='Search']")).click();
        //driver.findElement(By.xpath("//input[@placeholder='Search By Mobile Number or Trip Id']")).sendKeys("01812567321");
        //driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg']")).click();
        //driver.findElement(By.xpath("//div[normalize-space()='Trip Created']")).click();


        try {
            driver.findElement(By.xpath("//span[normalize-space()='Bid Management']")).click();
            driver.findElement(By.xpath("//a[@href='#/bid-management/accept-bid']")).click();

            driver.findElement(By.xpath("//*[@id=\"createPickUpCtrl2\"]")).sendKeys("" + 1050291);
            driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
            Thread.sleep(3000);
            WebElement w = driver.findElement(By.xpath("/html/body/app-root/app-layout/section/app-bid-management/app-accept-bid/div/div[2]/div[2]/table[1]/tbody/tr/th[12]/i"));
            w.click();


            driver.findElement(By.xpath("/html/body/app-root/app-layout/section/app-bid-management/app-accept-bid/div/div[2]/div[2]/table[2]/tbody/tr[3]/td[6]/button")).click();


//driver.findElement(By.xpath("/html/body/app-root/app-layout/section/app-bid-management/app-accept-bid/div/div[2]/div[2]/table[2]/tbody/tr[1]/td[6]/button")).click();
        } catch (Exception e) {

            System.out.println("An error occurred: " + e.getMessage());
        }

    }

}
