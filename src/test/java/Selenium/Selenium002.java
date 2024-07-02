package Selenium;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Selenium002 {

    public static void main(String[] args) {
        // SearchContext - Interface (findElement & findElements) - GGF
        // WebDriver - Interface - Incomplete Functions - GF
        // RemoteDriver - Class - It also has some functions - Father
        // Class - ChromeDriver, FirefoxDriver, EdgeDriver, SafariDriver - Son


        SearchContext driver= new ChromeDriver(); // GGF - This is useless, because it has only 2 functions
        WebDriver driver1 = new ChromeDriver(); // This contains all the functions
        RemoteWebDriver driver2 = new ChromeDriver(); // Fix to Remote
        ChromeDriver driver3 = new ChromeDriver(); //We have all the chrome functions but not the other functions
        EdgeDriver driver4= new EdgeDriver();

        //1. Do you want to run on Chrome pr Edge?
        //Solution- ChromeDriver driver3 = new ChromeDriver();

        //1.5 Do you want to run on Chrome and then change to Edge
        // Solution- WebDriver driver1 = new ChromeDriver();
        // driver = new EdgeDriver();

        //2. Do you want to run on multiple browsers?
        // Use this- RemoteWebDriver driver2 = new ChromeDriver();
        //With Grid - Advance



    }
}

