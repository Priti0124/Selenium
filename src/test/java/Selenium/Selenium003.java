package Selenium;

import io.cucumber.java.it.Ed;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Selenium003 {

    public static void main(String[] args) {
        EdgeOptions edgeOptions= new EdgeOptions();
//        edgeOptions.addArguments("--Start Maximised--");
        edgeOptions.addArguments("--incognito--");
        edgeOptions.addArguments("--window-size=800,600--");
//        edgeOptions.setHeadless(true);//there will be no UI, execution time will be low
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        //3 Page Load Strategy
        //1. Normal- Used by default, waits for all resources to download. Will wait for every element until the full page is not loaded completely
        //2. Eager- DOM access is ready. We will wait for the text and element, we will not wait for the images

        //3. None- Does not block WebDriver at all. Once the element is shown, we will interact with that.

        EdgeDriver driver=new EdgeDriver(edgeOptions); //Dynamic Dispatch- Runtime Poly
        driver.get("https://restful-booker.herokuapp.com/apidoc/index.html");

        Proxy proxy=new Proxy();
        proxy.setHttpProxy("<HOST:PORT"); //Proxy server will be used to hide IP address and information

        driver.close(); // it will close the browser window, not the full browser, session ID will not be NULL, it will be invalid
        driver.quit(); // 90% of the time, we will be using it, it will kill everything, session will be NULL.



//        EdgeDriver edgeDriver= new EdgeDriver();
//        edgeDriver.get("https://restful-booker.herokuapp.com/apidoc/index.html");



    }
}

