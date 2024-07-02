package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium001 {

    public static void main(String[] args) {

        WebDriver driver= new EdgeDriver();
        driver.get("https://restful-booker.herokuapp.com/apidoc/index.html");
        driver.close();



    }
}
