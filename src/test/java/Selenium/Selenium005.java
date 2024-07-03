package Selenium;

import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium005 {

    EdgeDriver driver;
    @BeforeTest

    public void OpenBrowser(){

        //Create session via API and session ID is generated
        driver = new EdgeDriver();
        //Launch the browser with URL
        driver.get("https://app.vwo.com/#/login");

    }

    @Owner("Priti")
            @Test
            public void NegativeTC(){

        //Email- <input type="email" class="text-input W(100%)" name="username" id="login-username" data-qa="hocewoqisi">

        //Password- <input type="password" class="text-input W(100%)" name="password" id="login-password" data-qa="jobodapuxe">

        //Button- <button type="submit" id="js-login-btn" class="btn btn--positive btn--inverted W(100%) H(48px) Fz(16px)" onclick="login.login(event)" data-qa="sibequkica">
        //									<span class="icon loader hidden" data-qa="zuyezasugu"></span>
        //									<span data-qa="ezazsuguuy">Sign in</span>
        //								</button>

        //Notification- <div class="notification-box-description" id="js-notification-box-msg" data-qa="rixawilomi">Your email, password, IP address or location did not match</div>




        System.out.println(driver.getCurrentUrl());

        EdgeOptions edgeOptions= new EdgeOptions();
        edgeOptions.addArguments("--start-maximized--");

        driver.manage().window().maximize();

        WebElement username= driver.findElement(By.id("login-username"));
        username.sendKeys("abc@gmail.com");

        WebElement password= driver.findElement(By.id("login-password"));
        password.sendKeys("Pass@123");

        WebElement button_submit = driver.findElement(By.id("js-login-btn"));
        button_submit.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement errorMessage= driver.findElement(By.id("js-notification-box-msg"));
        System.out.println(errorMessage.getText());

        Assert.assertEquals(errorMessage.getText(), "Your email, password, IP address or location did not match" );

        //To reiterate- .navigate().to()  and .get() are same
        //        //But .get() doesn't have back and forward function, navigate have these two functions

    }
    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
