package com.example;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class FlipkartElementTest {
    public static WebDriver driver;

    @BeforeTest
    public void setUp() {
        // Setup WebDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Initialize ChromeDriver instance
        driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();
    }

//    @Test
//    public void fetchAllElements() {
//        // Open Flipkart website
//        driver.get("https://www.flipkart.com");
//
//        List<WebElement> buttons = driver.findElements(By.tagName("button"));
//        System.out.println("Number of buttons: " + buttons.size());
//
//        // Find all headers on the page (assuming headers are represented by h1, h2, h3, etc. tags)
//        List<WebElement> headers = driver.findElements(By.xpath("//h1|//h2|//h3|//h4|//h5|//h6"));
//        System.out.println("Number of headers: " + headers.size());
//
//        // Find all search fields on the page (assuming input fields with type 'text' are search fields)
//        List<WebElement> searchFields = driver.findElements(By.cssSelector("input[type='text']"));
//        System.out.println("Number of search fields: " + searchFields.size());
//
//    }

    @Test
    public void AllListElements() {
        // Open Flipkart website
        driver.get("https://www.flipkart.com");

        List<WebElement> allElements = driver.findElements(By.xpath("//*"));

        // Print the count of elements
        System.out.println("Number of elements found: " + allElements.size());

        // Iterate through all elements and print their tag name and text content
        for (WebElement element : allElements) {
            String tagName = element.getTagName();
            String text = element.getText();
            System.out.println("Tag Name: " + tagName + ", Text: " + text);
        }
    }

    @AfterTest
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}
