package Selenium;

import org.openqa.selenium.edge.EdgeDriver;

public class Selenium004 {

    public static void main(String[] args) {

        EdgeDriver driver=new EdgeDriver();
        driver.get("https://restful-booker.herokuapp.com/apidoc/index.html"); //We have to give protocol https:// or else, site will not open

        driver.navigate().to("https://google.com");
        driver.navigate().to("https://gmail.com");
        driver.navigate().forward();
        driver.navigate().back();
        driver.navigate().refresh();

        //To reiterate- .navigate().to() and .get() are same
        //But .get() doesn't have back and forward function, navigate have these two functions




    }
}
