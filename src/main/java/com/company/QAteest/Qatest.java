package com.company.QAteest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Qatest {
    public static void main(String[] args) throws InterruptedException {
        //setting the driver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Леонид\\Downloads\\chromedriver_win32\\chromedriver.exe");

//Initiating your chromedriver
        WebDriver driver=new ChromeDriver();

//Applied wait time
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//maximize window
        driver.manage().window().maximize();

//open browser with desried URL
        driver.get("https://www.google.com");
        Thread.sleep(5000);
//closing the browser
        driver.close();
    }
}
