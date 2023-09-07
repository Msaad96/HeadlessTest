import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import javax.swing.text.Element;

public class HeadlessChrome {
    WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\saads\\IdeaProjects\\Drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://health-dev.duality.company/");
        System.out.println("Executing Chrome Driver in Headless mode..\n");

        System.out.println(">> Page Title : "+driver.getTitle());
        System.out.println(">> Page URL  : "+driver.getCurrentUrl());

        Thread.sleep(3000);

        WebElement EmailElement = driver.findElement(By.id("standard-basic"));
        EmailElement.sendKeys("saad@duality.company");

        WebElement PasswordElement = driver.findElement(By.name("password"));
        PasswordElement.sendKeys("St-duality9");

        WebElement FirstCheckMark = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div[2]/div[1]/form/div[1]/div[4]/span/input"));
        FirstCheckMark.click();

      //  WebElement SecondCheckMark = driver.findElement(By.xpath(""));







    }

    @Test
    public void PatientSignIn() throws InterruptedException {

        WebElement EmailAddressUsername = driver.findElement(By.id("standard-basic"));
        EmailAddressUsername.sendKeys("Saad@duality.company");

        Thread.sleep(3000);
        WebElement TextPassword = driver.findElement(By.name("password"));
        TextPassword.sendKeys("St-duality9");

        WebElement TermsAndConditionCheckBox = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/div/div[2]/div[1]/form/div[1]/div[3]/span/input"));
        TermsAndConditionCheckBox.click();

        WebElement PrivacyPolicyCheckBox = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/div/div[2]/div[1]/form/div[1]/div[4]/span/input"));
        PrivacyPolicyCheckBox.click();

        WebElement buttonSignin = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/div/div[2]/div[1]/form/div[2]/div/button"));
        buttonSignin.click();

        Thread.sleep(6000);
        WebElement ButtonOkmodal = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div/div/button"));
        ButtonOkmodal.click();

        System.out.print("2. Patient Login Successfully\n");
        System.out.println("=====+++*****=========");
        Thread.sleep(6000);

    }



}










