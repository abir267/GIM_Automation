package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlaceBid {
    private static int c;

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub

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
        driver.findElement(By.xpath("//*[(text()='SOC')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[normalize-space()='Place Bid']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Search partner by mobile number']")).sendKeys("01813567321");
        driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@class='place-bid-btn ng-star-inserted']")).click();
        Thread.sleep(2000);



        try {
            WebElement number = driver.findElement(By.xpath("//input[@formcontrolname=\"bidAmount\"]"));
            int c = 10000;
            number.click();
            number.clear();
            number.sendKeys(""+c);

            WebElement Number2 = driver.findElement(By.xpath("//input[@formcontrolname=\"advanceAmount\"]"));
            int n=5600;
            Number2.click();
            Number2.clear();
            Number2.sendKeys(""+n);


            Thread.sleep(3000);
            WebElement s= driver.findElement(By.xpath("/html/body/app-root/app-layout/section/app-service-operation-center/app-place-bid/div/div[3]/div/as-split/as-split-area[2]/div/div/section/form/div/div/div[3]/div/div/ng-select/div/div/div[2]/input"));

            s.sendKeys("Barishal");
            s.sendKeys(Keys.ARROW_DOWN);
            s.sendKeys(Keys.ENTER);

            WebElement w= driver.findElement(By.xpath("/html/body/app-root/app-layout/section/app-service-operation-center/app-place-bid/div/div[3]/div/as-split/as-split-area[2]/div/div/section/form/div/div/div[4]/div/div/ng-select/div/div/div[2]/input"));
            w.sendKeys("k");
            w.sendKeys(Keys.ARROW_DOWN);
            w.sendKeys(Keys.ENTER);



            Thread.sleep(3000);


            driver.findElement(By.xpath("//button[normalize-space()='Place a BID']")).click();

            driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div/div[2]/textarea")).sendKeys("hi");
            driver.findElement(By.xpath("//button[normalize-space()='Place A Bid']")).click();



            // Alert alert=driver.switchTo().alert();
            //String textOnPrompt= alert.getText();
            //System.out.println(textOnPrompt);



            //driver.findElement(By.cssSelector(".form-control.ng-pristine.ng-valid.ng-touched")).sendKeys("hi");
            //driver.findElement(By.xpath("//button[normalize-space()='Place A Bid']")).click();
            //Thread.sleep(3000);


        }
        catch (Exception e) {

            System.out.println("An error occurred: " + e.getMessage());
        }
    }




    //WebElement searchBox =driver.findElement(By.xpath("//input[@class='form-control ng-touched ng-dirty ng-invalid']"));

    //JavascriptExecutor jse = (JavascriptExecutor) driver;

    //jse.executeScript("arguments[0].value='10000'", searchBox); .form-control.ng-pristine.ng-invalid.ng-touched





    //driver.findElement(By.xpath("//input[@formcontrolname='advanceAmount']")).sendKeys("3000");
    //driver.findElement(By.xpath("//input[@class='form-control ng-valid ng-pristine ng-touched']")).sendKeys("5000");







}
